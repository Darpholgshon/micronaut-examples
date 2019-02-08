package org.hodgson.controller

import io.micronaut.context.ApplicationContext
import io.micronaut.core.type.Argument
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.runtime.server.EmbeddedServer
import org.hodgson.model.Book
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

/**
 *
 * @author <ahref="ralphho@pressassociation.com "  >  Ralph Hodgson</a>
 * @since 2019-02-08T11:14:49
 */
class BooksControllerSpec extends Specification {
  @Shared
  @AutoCleanup
  EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

  @Shared
  @AutoCleanup
  RxHttpClient client = embeddedServer.applicationContext.createBean(RxHttpClient, embeddedServer.getURL())

  void "test books retrieve"() {
    when:
    HttpRequest request = HttpRequest.GET('/api/books')
    List<Book> books = client.toBlocking().retrieve(request, Argument.of(List, Book))

    then:
    books
    books.size() == 2
  }
}
