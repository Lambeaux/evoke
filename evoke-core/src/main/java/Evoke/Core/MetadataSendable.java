package Evoke.Core;

import java.util.Date;

/**
 * Created by lambeaux on 2/20/16.
 *
 */
public interface MetadataSendable {
    /**
     * If data can be sent, it implies that it was created. This interface requires access to a
     * value representing the date and time of creation.
     *
     * @return The date and time of creation accurate to the nearest milisecond.
     */
    Date getTimeCreated();

    /**
     * To improve management of all {@link MetadataSendable}'s, each attempt to send the data should
     * log an appropriate time stamp. Only the time of the latest attempt is relevant. If no
     * attempts have occurred, this value returns null.
     *
     * @return The date and time this object was last attempted to be transmitted, or null if no
     * attempts occurred.
     */
    Date getTimeLastSendAttempt();

    /**
     * Verifying an object was successfully sent ensures issues are caught early by the server. It
     * is acceptable for this value to be null after deserialization on the receiver's side of the
     * network.
     *
     * @return True if this object was successfully sent, null if it's not applicable, or False
     * otherwise.
     */
    Boolean sendSuccessful();
}
