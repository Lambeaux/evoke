package Evoke.Core.Session;

import java.util.List;

/**
 * Represents a user that can be stored and associated with individual game trials, or
 * a {@link PlaySession}, along with survey and account metadata.
 */
public class PlaySubject {
    private String email;
    private String firstName;
    private String lastName;
    private String passwordHash;

    private List<PlaySession> sessions;
}
