package Evoke.Core.Session;

/**
 * Responsible for subdividing and assembling a {@link PlaySegment} according to
 * the provided {@link SegmentationStrategy}.
 */
public class SegmentBuilder {
    private SegmentationStrategy strategy;

    public SegmentBuilder(SegmentationStrategy strategy) {
        this.strategy = strategy;
    }
}
