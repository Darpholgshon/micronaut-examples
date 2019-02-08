package org.hodgson.controller

/**
 *
 * @author <a href="ralphho@pressassociation.com">Ralph Hodgson</a>
 * @since 2019-02-08T11:49:58
 */
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/api")
class BooksController {

  @Produces(MediaType.TEXT_PLAIN)
  @Get("/inventory/{isbn}")
  fun inventory(isbn: String): HttpResponse<Int> {
    return when (isbn) {
      "1491950358" -> HttpResponse.ok(2)
      "1680502395" -> HttpResponse.ok(3)
      else -> HttpResponse.notFound()
    }
  }
}