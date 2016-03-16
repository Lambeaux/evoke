package Evoke.Core.Affect;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Evoke.Core.AbstractDataObject;

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

    public Object getComponent(int index) {
        if (index > dataComponents.size()) {
            throw new IllegalArgumentException("Index exceeds tuple count");
        }

        Collection<Object> objects = dataComponents.values();
        return objects.toArray()[index];
    }

    public Object getComponent(String key) {
        if (!dataComponents.containsKey(key)) {
            throw new IllegalArgumentException("Key not found");
        }

        return dataComponents.get(key);
    }

    public Map<String, Object> getIndexedProperties() {

        return dataComponents;
    }
}
