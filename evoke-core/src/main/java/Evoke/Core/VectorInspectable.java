package Evoke.Core;

import javafx.util.Pair;

/**
 * Created by lambeaux on 2/21/16.
 *
 */
public interface VectorInspectable {
    int getTupleCount();
    Pair<String, Object> getComponent(int index);
    Pair<String, Object> getComponent(String key);
}
