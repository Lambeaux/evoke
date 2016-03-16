package Evoke.Core.Identity;

import java.util.HashMap;
import java.util.Map;

import Evoke.Core.MetadataStorable;

/**
 * Represents a user that can be stored and associated with individual game trials, or
 * an {@link PlaySession}, along with survey and account metadata.
 */
public class AffectSubject implements MetadataStorable {
    private String email;
    private String firstName;
    private String lastName;
    private String passwordHash;

    public Map<String, Object> getIndexedProperties() {
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("email", email);
        props.put("firstName", firstName);
        props.put("lastName", lastName);
        return props;
    }
}
