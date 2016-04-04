package Evoke.Storage;

import Evoke.Core.Mover;

/**
 * Base interface for defining a data access object. Acts as a service to the database
 * that exists behind the scenes.
 */
public interface StorageProvider {
    String insert(Storable item);
    String insert(Storable item, String parentKey);
}
