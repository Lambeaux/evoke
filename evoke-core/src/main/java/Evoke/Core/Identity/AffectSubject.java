package Evoke.Core.Identity;

import java.util.Map;

import Evoke.Core.MetadataStorable;

/**
 * Represents a user that can be stored and associated with individual game trials, or
 * an {@link AffectGameSession}, along with survey and account metadata.
 */
public class AffectSubject implements MetadataStorable {
    public String getKey() {
        return null;
    }

    public Map<String, Object> getIndexedProperties() {
        return null;
    }

    public Map<String, Object> getUnindexedProperties() {
        return null;
    }
}
