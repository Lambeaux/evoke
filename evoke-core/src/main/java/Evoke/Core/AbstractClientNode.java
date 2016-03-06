package Evoke.Core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lambeaux on 2/22/16.
 * Template for async threading logic. Acts as a provider to either a {@link DataMover} or
 * a {@link MetadataSerializer} using a common interface.
 */
public abstract class AbstractClientNode {
    private List<DataSendable> localSendables;

    private List<DataSendable> remoteSendables;

    protected AbstractClientNode() {
        localSendables = new ArrayList<DataSendable>();
        remoteSendables = new ArrayList<DataSendable>();
    }
}
