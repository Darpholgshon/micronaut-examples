package org.hodgson.client;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Maybe;
import org.hodgson.service.InventoryFetcher;

/**
 * @author <a href="ralphho@pressassociation.com">Ralph Hodgson</a>
 * @since 2019-02-08T11:59:22
 */
@Client("inventory")
@Requires(notEnv = Environment.TEST)
public interface InventoryClient extends InventoryFetcher {
  @Override
  @Get("/api/inventory/{isbn}")
  Maybe<Integer> inventory(String isbn);
}