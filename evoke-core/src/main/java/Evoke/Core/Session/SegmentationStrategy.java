package Evoke.Core.Session;

import Evoke.Core.Moveable;

/**
 * Defines how a stream of data is split into the tree of representative segments.
 */
public interface SegmentationStrategy {
    boolean segmentAvailable();
    PlaySegment getSegment();
    void submitData(Moveable data);
}
