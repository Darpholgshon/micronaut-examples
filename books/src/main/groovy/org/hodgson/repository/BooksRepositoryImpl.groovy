package org.hodgson.repository

import groovy.transform.CompileStatic
import javax.inject.Singleton
import org.hodgson.model.Book

/**
 *
 * @author <ahref="ralphho@pressassociation.com " > Ralph Hodgson</a>
 * @since 2019-02-08T11:12:50
 */
@CompileStatic
@Singleton
class BooksRepositoryImpl implements BooksRepository {

  @Override
  List<Book> findAll() {
    [
      new Book("1491950358", "Building Microservices"),
      new Book("1680502395", "Release It!"),
    ]
  }
}