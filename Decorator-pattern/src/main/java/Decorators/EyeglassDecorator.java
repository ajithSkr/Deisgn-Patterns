package Decorators;

import Main.GetEyeGlass;
import Utils.Eyeglass;

/**
 * @author ajith.athithyan
 * @project Decorator-pattern
 */
public abstract class EyeglassDecorator implements Eyeglass {

    protected Eyeglass eyeglass;
    public  EyeglassDecorator (Eyeglass eyeglass)
    {
        this.eyeglass=eyeglass;
    }

    public  String glassShape() {
        return eyeglass.glassShape();
    }

    public Float glassPrice() {

        return eyeglass.glassPrice();

    }


}
