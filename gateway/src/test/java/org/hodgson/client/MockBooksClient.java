package org.hodgson.client;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Flowable;
import org.hodgson.model.Book;
import org.hodgson.service.BooksFetcher;

import javax.inject.Singleton;

/**
 * @author <a href="ralphho@pressassociation.com">Ralph Hodgson</a>
 * @since 2019-02-08T12:01:57
 */
@Singleton
@Requires(env = Environment.TEST)
public class MockBooksClient implements BooksFetcher {
  @Override
  public Flowable<Book> fetchBooks() {
    return Flowable.just(new Book("1491950358", "Building Microservices"), new Book("1680502395", "Release It!"), new Book("0321601912", "Continuous Delivery:"));
  }
}