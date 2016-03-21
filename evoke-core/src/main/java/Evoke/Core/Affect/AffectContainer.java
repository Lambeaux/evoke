package Evoke.Core.Affect;

import java.util.LinkedList;
import java.util.List;

/**
 * Set of {@link AffectVector}'s of a specific type and adhering to the
 * schema provided.
 */
public class AffectContainer {
    private List<AffectVector> vectors;

    private SchemaReference schemaReference;

    public AffectContainer(SchemaReference schemaReference) {
        this.schemaReference = schemaReference;
        vectors = new LinkedList<AffectVector>();
    }

    public Iterable<AffectVector> getVectors() {
        return vectors;
    }

}
