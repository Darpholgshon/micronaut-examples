package org.hodgson.client;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.reactivex.Maybe;
import org.hodgson.service.InventoryFetcher;

import javax.inject.Singleton;

/**
 * @author <a href="ralphho@pressassociation.com">Ralph Hodgson</a>
 * @since 2019-02-08T12:02:08
 */
@Singleton
@Requires(env = Environment.TEST)
public class MockInventoryClient implements InventoryFetcher {

  @Override
  public Maybe<Integer> inventory(String isbn) {
    if (isbn.equals("1491950358")) {
      return Maybe.just(2);
    }
    if (isbn.equals("1680502395")) {
      return Maybe.just(0);
    }
    return Maybe.empty();
  }
}