package Evoke.Core;

/**
 * Contract required by all classes that move metadata from one endpoint to another. These
 * endpoints can be sockets, databases, other {@link MetadataMover}s, or services. This
 * interface defines a two-way form of communication for moving objects.
 */
public interface MetadataMover {
    /**
     * Submit a {@link MetadataSendable} object to the linked {@link MetadataMover}.
     * @param sendable  the object to send.
     * @return          true if the send was successful and false otherwise.
     */
    boolean send(MetadataSendable sendable);

    /**
     * Receive a {@link MetadataSendable} from the linked {@link MetadataMover}.
     * @return          the received object, or null if none is available.
     */
    MetadataSendable receive();
}
