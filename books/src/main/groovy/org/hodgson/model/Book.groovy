package org.hodgson.model

import groovy.transform.CompileStatic
import groovy.transform.TupleConstructor

/**
 *
 * @author <ahref="ralphho@pressassociation.com " > Ralph Hodgson</a>
 * @since 2019-02-08T11:11:10
 */
@CompileStatic
@TupleConstructor
class Book {
  String isbn
  String name
}