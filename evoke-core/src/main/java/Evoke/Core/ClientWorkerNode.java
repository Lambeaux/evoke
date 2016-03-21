package Evoke.Core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lambeaux on 2/22/16.
 * Template for async threading logic. Acts as a provider to either a {@link Mover} or
 * a {@link Marshaller} using a common interface.
 */
public class ClientWorkerNode {
    private List<Moveable> sentSendables;

    private List<Moveable> receivedSendables;

    public ClientWorkerNode() {
        sentSendables = new ArrayList<Moveable>();
        receivedSendables = new ArrayList<Moveable>();
    }
}
