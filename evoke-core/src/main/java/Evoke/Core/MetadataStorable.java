package Evoke.Core;

import java.util.Map;

/**
 * Anything that can be stored in a NoSQL database should implement this interface.
 * It provides a logical abstraction layer so that any NoSQL provider can be used.
 */
public interface MetadataStorable {
    /**
     * Fields that are indexed on the type need to be specified. If there are none, do not
     * return null; return an empty map.
     * @return  a map of the indexed fields for the type to be stored.
     */
    Map<String, Object> getIndexedProperties();
}
