package Evoke.Core.Affect;

/**
 * Created by lambeaux on 2/21/16.
 *
 */
public interface VectorInspectable {
    /**
     * Any vector that exposes its components should also know how many components it has.
     * @return  the number of components this vector has.
     */
    int getTupleCount();

    /**
     *  TODO: Add the mathematical vector API.
     *
     *  The contract specified here should only represent tuple-agnostic values.
     *  Examples may include the dot product, etc.
     */
}
