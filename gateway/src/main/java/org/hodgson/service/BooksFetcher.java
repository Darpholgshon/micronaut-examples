package org.hodgson.service;

import io.reactivex.Flowable;
import org.hodgson.model.Book;

/**
 * @author <a href="ralphho@pressassociation.com">Ralph Hodgson</a>
 * @since 2019-02-08T11:54:45
 */
public interface BooksFetcher {
  Flowable<Book> fetchBooks();
}
