package Utils.FrameTypes;

import Utils.Eyeglass;

/**
 * @author ajith.athithyan
 * @project Decorator-pattern
 */
public class RectangleFrame implements Eyeglass {

    public String glassShape() {
        return "Rectangle Frame ";
    }

    public Float glassPrice() {

        return 1500F;
    }
}
