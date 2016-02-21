/**
 * Created by lambeaux on 2/20/16.
 *
 */
public interface DataControllable extends DataSendable {
    String toTransmittableFormat();
    void executeNextStep(int state);
    boolean isFinished();
}
