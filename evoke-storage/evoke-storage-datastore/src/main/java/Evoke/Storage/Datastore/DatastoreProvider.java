package Evoke.Storage.Datastore;

import org.apache.commons.beanutils.BeanMap;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.KeyFactory;

import Evoke.Storage.Storable;
import Evoke.Storage.StorageProvider;

/**
 * {@link StorageProvider} implementation for Google's cloud solution.
 */
public class DatastoreProvider implements StorageProvider {
    private DatastoreService datastoreService;

    public DatastoreProvider() {
        datastoreService = DatastoreServiceFactory.getDatastoreService();
    }

    public String insert(Storable item) {
        Entity entity = new Entity(item.getClass()
                .getName());
        fillEntity(entity, item);
        return datastoreService.put(entity).toString();
    }

    public String insert(Storable item, String parentKey) {
        Entity entity = new Entity(item.getClass()
                .getName(), KeyFactory.stringToKey(parentKey));
        fillEntity(entity, item);
        return datastoreService.put(entity).toString();
    }

    private void fillEntity(Entity entity, Storable item) {
        BeanMap map = new BeanMap(item);
        for (Object key : map.keySet()) {
            entity.setProperty((String) key, map.get(key));
        }
    }
}
