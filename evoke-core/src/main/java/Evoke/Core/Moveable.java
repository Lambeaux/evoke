package Evoke.Core;

import java.util.Date;

/**
 * Created by lambeaux on 2/20/16.
 *
 */
public interface Moveable {
    /**
     * If data can be sent, it implies that it was created. This interface requires
     * access to a value representing the date and time of creation.
     *
     * @return The date and time of creation accurate to the nearest milisecond.
     */
    Date getTimeCreated();
}
