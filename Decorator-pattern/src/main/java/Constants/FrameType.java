package Constants;

/**
 * @author ajith.athithyan
 * @project Decorator-pattern
 */
public enum FrameType {

    HALFRIM("Half Rim"),
    FULLRIM("Full Rim"),
    RIMLESS("Rim Less");

    private String frameType;

    FrameType(String frameType) {
        this.frameType = frameType;
    }

    public String getFrameType() {
        return this.frameType;
    }

}
