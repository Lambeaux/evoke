package Evoke.Storage;

/**
 * Possibly preserve type-safety for data conversions?
 */
public interface StorageAdapter <T> {
    ObjectTransformer<T, ?> getTransformer();
}
