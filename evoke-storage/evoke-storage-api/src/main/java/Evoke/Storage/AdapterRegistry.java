package Evoke.Storage;

import java.lang.reflect.Type;
import java.util.Map;

public class AdapterRegistry {
    private Map<Type, ObjectTransformer> registry;

    public void get() {
        registry.get(AdapterRegistry.class);
    }
}
