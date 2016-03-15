package Evoke.Core.Affect;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Evoke.Core.AbstractDataObject;
import javafx.util.Pair;

/**
 * Created by lambeaux on 2/21/16.
 *
 */
public class AffectVector extends AbstractDataObject implements VectorInspectable {
    protected HashMap<String, Object> dataComponents;
    protected SchemaReference dataSchema;

    public AffectVector() {
        dataComponents = new HashMap<String, Object>();
        dataSchema = null;
    }

    public int getTupleCount() {
        return 0;
    }

    public List<String> getKeys() {
        return null;
    }

    public Pair<String, Object> getComponent(int index) {
        return null;
    }

    public Pair<String, Object> getComponent(String key) {
        return null;
    }

    public String getKey() {
        return null;
    }

    public Map<String, Object> getIndexedProperties() {
        return null;
    }

    public Map<String, Object> getUnindexedProperties() {
        return null;
    }
}
