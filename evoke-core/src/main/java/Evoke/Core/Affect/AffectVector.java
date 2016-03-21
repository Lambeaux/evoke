package Evoke.Core.Affect;

import java.util.Date;

import Evoke.Core.Moveable;

/**
 * Created by lambeaux on 2/21/16.
 *
 */
public abstract class AffectVector implements Moveable, VectorInspectable {
    protected Date timeCreated;

    protected AffectVector() {
        timeCreated = new Date();
    }

    public Date getTimeCreated() {
        return timeCreated;
    }
}
