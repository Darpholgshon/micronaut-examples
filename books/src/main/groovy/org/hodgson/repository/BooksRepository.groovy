package org.hodgson.repository

import java.awt.print.Book

/**
 *
 * @author <ahref="ralphho@pressassociation.com " > Ralph Hodgson</a>
 * @since 2019-02-08T11:10:41
 */
interface BooksRepository {
  List<Book> findAll()
}