package Evoke.Core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lambeaux on 2/22/16.
 * Template for async threading logic. Acts as a provider to either a {@link MetadataMover} or
 * a {@link MetadataSerializer} using a common interface.
 */
public class ClientDataflowNode {
    private List<MetadataSendable> sentSendables;

    private List<MetadataSendable> receivedSendables;

    public ClientDataflowNode() {
        sentSendables = new ArrayList<MetadataSendable>();
        receivedSendables = new ArrayList<MetadataSendable>();

    }
}
