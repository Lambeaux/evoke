package Evoke.Core.Affect;

import java.util.List;

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
     * The proper names of the keys might not be known by a third party; which may wish to
     * browse a list of the keys that this vector offers.
     * @return  a list of keys for accessing the vector's data.
     */
    List<String> getKeys();

    /**
     * Get the component given a numerical index representing that component.
     * @param index     the zero-based index of the component.
     * @return          the value of the vector's component at the specified index.
     */
    Object getComponent(int index);

    /**
     * Get the component given its key.
     * @param key   the key, or fully qualified name, of the component.
     * @return      the value of the vector's component for the given key.
     */
    Object getComponent(String key);
}
