package Evoke.Core;

import java.util.ArrayList;
import java.util.List;

import Evoke.Core.Session.PlaySession;
import Evoke.Core.Session.PlaySubject;

/**
 * Template for async threading logic. Acts as a provider to either a {@link Mover} or
 * a {@link Marshaller} using a common interface.
 */
public class ClientNode {
    private PlaySubject subject = null;
    private PlaySession session = null;

    public ClientNode() {
    }
}
