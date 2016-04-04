package Evoke.Core.Session;

import Evoke.Core.Mover;

/**
 * Defines how a stream of data is split into the tree of representative segments.
 */
public interface SegmentationStrategy extends Mover {
    boolean segmentAvailable();
    PlaySegment getSegment();
}
