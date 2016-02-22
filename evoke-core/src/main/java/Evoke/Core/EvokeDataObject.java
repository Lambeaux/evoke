package Evoke.Core;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by lambeaux on 2/21/16.
 *
 */
public class EvokeDataObject implements DataSendable {
    private Date timeCreated;

    private Date timeLastAttempt;

    private transient Boolean sendSuccessful;

    protected HashMap<String, Object> metadata;

    /**
     *
     */
    protected EvokeDataObject() {
        timeLastAttempt = null;
        sendSuccessful = null;

        timeCreated = new Date();
        metadata = null;
    }

    /**
     *
     * @param key
     * @param value
     */
    protected void addFieldToMetadata(String key, Object value) {
        if (metadata == null) {
            metadata = new HashMap<String, Object>();
        }

        metadata.put(key, value);
    }

    /**
     *
     * @return
     */
    public Date getTimeCreated() {
        return timeCreated;
    }

    /**
     *
     * @return
     */
    public Date getTimeLastSendAttempt() {
        return timeLastAttempt;
    }

    /**
     *
     * @return
     */
    public Boolean sendSuccessful() {
        return sendSuccessful;
    }

    /**
     *
     * @param key
     * @return
     */
    public Object getFieldFromMetadata(String key) {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("Cannot access metadata with null or empty key");
        }
        return metadata.get(key);
    }
}
