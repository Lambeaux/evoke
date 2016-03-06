package Evoke.Core;

/**
 * Created by lambeaux on 3/5/16.
 *
 */
public interface MetadataTransformer {
    Class getTargetClass();
    Object transform(Object subject);

}
