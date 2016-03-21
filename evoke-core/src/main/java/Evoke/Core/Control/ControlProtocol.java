package Evoke.Core.Control;

/**
 * Created by lambeaux on 2/21/16.
 *
 */
public abstract class ControlProtocol implements Protocol {
    public void executeNextStep(int state) {

    }

    public boolean isFinished() {
        return false;
    }
}
