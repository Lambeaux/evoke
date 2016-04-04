package Evoke.Storage;

import java.util.Date;

import Evoke.Core.Moveable;
import Evoke.Core.MoveableResult;
import Evoke.Core.Mover;
import Evoke.Core.Session.PlaySegment;
import Evoke.Core.Session.SegmentationStrategy;

/**
 * Implementation of a {@link Mover} for use with a {@link StorageProvider}. Useful
 * for abstracting the details of interfacing with the storage module.
 */
public class StorageNode implements SegmentationStrategy {
    private final StorageProvider provider;

    public StorageNode(StorageProvider provider) {
        this.provider = provider;
    }

    public MoveableResult move(Moveable moveable) {
        if (moveable instanceof Storable) {
            provider.insert((Storable) moveable);
            return new MoveableResult(moveable, new Date(), true);
        }

        return new MoveableResult(moveable, new Date(), false);
    }

    public boolean segmentAvailable() {
        return false;
    }

    public PlaySegment getSegment() {
        return null;
    }
}
