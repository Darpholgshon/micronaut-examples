package org.hodgson.controller

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.hodgson.repository.BooksRepository

import java.awt.print.Book

/**
 *
 * @author <ahref="ralphho@pressassociation.com " > Ralph Hodgson</a>
 * @since 2019-02-08T11:09:50
 */
@CompileStatic
@Controller("/api")
class BooksController {

  private final BooksRepository booksRepository

  BooksController(BooksRepository booksRepository) {
    this.booksRepository = booksRepository
  }

  @Get("/books")
  List<Book> list() {
    booksRepository.findAll()
  }
}