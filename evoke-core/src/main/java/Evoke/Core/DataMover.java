package Evoke.Core;

/**
 * Created by lambeaux on 2/20/16.
 *
 */
public interface DataMover {
    boolean send(DataSendable sendable);
    DataSendable receive();
}
