package Evoke.Storage;

public interface ObjectTransformer <U, V> {
    V transform(U subject);
}
