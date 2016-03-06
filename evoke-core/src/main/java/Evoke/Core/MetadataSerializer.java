package Evoke.Core;

/**
 * Created by lambeaux on 2/21/16.
 *
 */
public interface MetadataSerializer {
    /**
     * Take a Java object and transform it into a metadata format determined by the implementation
     * of this transformer.
     *
     * @param objToMarshal The Java object to transform.
     * @return A structured String representation of the provided Java object.
     */
    String marshal(Object objToMarshal);

    /**
     * Given a structured String of metadata and target class, attempt to instantiate and return an
     * instance of the class initilized with the values in the metadata.
     *
     * @param objAsData The String of metadata.
     * @param classOfObj The type of Java object to get back from unmarshalling, if possible.
     * @return Java object initialized by the metadata.
     */
    Object unmarshal(String objAsData, Class classOfObj);
}
