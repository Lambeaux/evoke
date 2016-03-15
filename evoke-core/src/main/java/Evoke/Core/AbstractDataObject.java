package Evoke.Core;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by lambeaux on 2/21/16.
 *
 */
public abstract class AbstractDataObject implements MetadataSendable, MetadataStorable {
    private Date timeCreated;

    private transient Date timeLastAttempt;

    private transient Boolean sendSuccessful;

    /**
     * Constructor. Should be deferred to by implementations.
     */
    protected AbstractDataObject() {
        timeLastAttempt = null;
        sendSuccessful = null;

        timeCreated = new Date();
    }

    /**
     * {@inheritDoc}
     */
    public Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * {@inheritDoc}
     */
    public Date getTimeLastSendAttempt() {
        return timeLastAttempt;
    }

    /**
     * {@inheritDoc}
     */
    public Boolean sendSuccessful() {
        return sendSuccessful;
    }


}
