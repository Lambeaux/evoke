package Evoke.Core;

/**
 * Created by lambeaux on 2/29/16.
 *
 */
public interface MetadataStorable {
    /**
     * Anything that is storable should have a key for indexing.
     *
     * @return Primary key of the entity being stored.
     */
    String getKey();
}
