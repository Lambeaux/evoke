package Evoke.Core;

/**
 * Contract required by all classes that move metadata from one endpoint to another. These
 * endpoints can be sockets, databases, other {@link Mover}s, or services. This
 * interface defines a one-way form of communication for moving objects.
 */
public interface Mover {
    /**
     * Submit a {@link Moveable} object to the linked {@link Mover}.
     * @param moveable  the object to move.
     * @return          true if the move was successful and false otherwise.
     */
    MoveableResult move(Moveable moveable);
}
