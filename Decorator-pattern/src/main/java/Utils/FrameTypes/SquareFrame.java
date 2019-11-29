package Utils.FrameTypes;

import Utils.Eyeglass;

/**
 * @author ajith.athithyan
 * @project Decorator-pattern
 */
public class SquareFrame implements Eyeglass {

    public String glassShape() {
        return "Square Frame ";
    }

    public Float glassPrice() {

        return 1300F;
    }
}
