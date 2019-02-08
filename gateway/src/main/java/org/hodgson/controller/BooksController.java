package org.hodgson.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import org.hodgson.model.Book;
import org.hodgson.service.BooksFetcher;
import org.hodgson.service.InventoryFetcher;

/**
 * @author <a href="ralphho@pressassociation.com">Ralph Hodgson</a>
 * @since 2019-02-08T11:59:58
 */
@Controller("/api")
public class BooksController {

  private final BooksFetcher booksFetcher;
  private final InventoryFetcher inventoryFetcher;

  public BooksController(BooksFetcher booksFetcher, InventoryFetcher inventoryFetcher) {
    this.booksFetcher = booksFetcher;
    this.inventoryFetcher = inventoryFetcher;
  }

  @Get("/books")
  Flowable<Book> findAll() {
    return booksFetcher.fetchBooks()
      .flatMapMaybe(b -> inventoryFetcher.inventory(b.getIsbn())
        .filter(stock -> stock > 0)
        .map(stock -> {
          b.setStock(stock);
          return b;
        })
      );
  }
}