package Evoke.Core.Control;

import Evoke.Core.AbstractDataObject;

/**
 * Created by lambeaux on 2/21/16.
 *
 */
public class AbstractControlProtocol extends AbstractDataObject implements ProtocolDefineable {
    public void executeNextStep(int state) {

    }

    public boolean isFinished() {
        return false;
    }
}
