package Evoke.Core.Control;

/**
 * Created by lambeaux on 2/20/16.
 *
 */
public interface ProtocolDefineable {
    /**
     * Based on the provided integer, perform the next step of the protocol.
     *
     * @param state An integer defining the current step the protocol is on.
     */
    void executeNextStep(int state);

    /**
     * Since protocols can consist of an arbitrary number of steps, it is necessary to define when
     * the current implementation has finished so the object may be disposed.
     *
     * @return True if the protocol has completed. False if more steps remain and the object should
     * be updated and returned to the sender.
     */
    boolean isFinished();
}