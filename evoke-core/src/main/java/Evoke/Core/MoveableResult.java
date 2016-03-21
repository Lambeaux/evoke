package Evoke.Core;

import java.util.Date;

/**
 * Represents the result of an attempt to move metadata.
 */
public class MoveableResult {
    private Date lastMoveAttempt;

    private boolean moveSuccessful;

    private Moveable moveable;

    public MoveableResult(Moveable moveable, Date lastMoveAttempt, boolean moveSuccessful) {
        this.moveable = moveable;
        this.lastMoveAttempt = lastMoveAttempt;
        this.moveSuccessful = moveSuccessful;
    }

    /**
     * Get the moveable that this result applies to.
     *
     * @return the moveable for this result.
     */
    public Moveable getMoveable() {
        return moveable;
    }

    /**
     * Verifying an object was successfully sent ensures issues are caught early by the
     * server.
     *
     * @return True if this object was successfully sent or False otherwise.
     */
    public boolean isMoveSuccessful() {
        return moveSuccessful;
    }

    /**
     * To improve management of all {@link Moveable}'s, each attempt to move
     * the data should log an appropriate time stamp. Only the time of the latest
     * attempt is relevant.
     *
     * @return The date and time this object was last attempted to be transmitted.
     */
    public Date getLastMoveAttempt() {
        return lastMoveAttempt;
    }
}
