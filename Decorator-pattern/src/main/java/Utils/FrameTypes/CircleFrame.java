package Utils.FrameTypes;

import Utils.Eyeglass;

/**
 * @author ajith.athithyan
 * @project Decorator-pattern
 */
public class CircleFrame implements Eyeglass {

    public String glassShape() {
        return "Circle Frame ";
    }

    public Float glassPrice() {

        return 1200F;
    }
}
