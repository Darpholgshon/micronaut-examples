package org.hodgson.service;

import io.reactivex.Maybe;

/**
 * @author <a href="ralphho@pressassociation.com">Ralph Hodgson</a>
 * @since 2019-02-08T11:58:47
 */
public interface InventoryFetcher {
  Maybe<Integer> inventory(String isbn);
}