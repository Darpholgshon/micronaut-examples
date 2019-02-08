package org.hodgson.client;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;
import org.hodgson.model.Book;
import org.hodgson.service.BooksFetcher;

/**
 * @author <a href="ralphho@pressassociation.com">Ralph Hodgson</a>
 * @since 2019-02-08T11:57:11
 */
@Client("books")
@Requires(notEnv = Environment.TEST)
public interface BooksClient extends BooksFetcher {

  @Override @Get("/api/books")
  Flowable<Book> fetchBooks();
}

