package Evoke.Core.Session;

import java.util.Date;

import Evoke.Core.Moveable;
import Evoke.Core.MoveableResult;
import Evoke.Core.Mover;

/**
 * This {@link SegmentationStrategy} simpy subdivides the child units based on
 * the passing of time for any valid {@link Evoke.Core.Moveable}
 */
public class SegmentByTime implements SegmentationStrategy {
    private final long timeDelta;
    private Date lastTimestamp = null;
    private Mover compositeMover;

    public SegmentByTime(long timeDelta, Mover compositeMover) {
        this.timeDelta = timeDelta;

    }

    public boolean segmentAvailable() {
        return false;
    }

    public PlaySegment getSegment() {
        return null;
    }

    public MoveableResult move(Moveable moveable) {
        return null;
    }
}
