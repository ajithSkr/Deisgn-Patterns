package Constants;

/**
 * @author ajith.athithyan
 * @project Decorator-pattern
 */
public enum FrameColor {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    WHITE("white"),
    YELLOW("yellow");

    private String color;

    FrameColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
