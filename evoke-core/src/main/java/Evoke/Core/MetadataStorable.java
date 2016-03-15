package Evoke.Core;

import java.util.Map;

/**
 * Anything that can be stored in a NoSQL database should implement this interface.
 * It provides a logical abstraction layer so that any NoSQL provider can be used.
 */
public interface MetadataStorable {
    /**
     * Anything that is storable should have a key for indexing.
     * @return Primary key of the entity being stored.
     */
    String getKey();

    /**
     * Fields that are indexed on the type need to be specified. If there are none, do not
     * return null; return an empty map.
     * @return  a map of the indexed fields for the type to be stored.
     */
    Map<String, Object> getIndexedProperties();

    /**
     * Not all fields that are stored need to be indexed. Use this method to get a map of
     * the fields that are stored but not indexed; or an empty map if none exist.
     * @return  a map of unindexed fields for the type to be stored.
     */
    Map<String, Object> getUnindexedProperties();
}
