package FrameBrands;

import Constants.FrameColor;
import Constants.FrameType;
import Decorators.EyeglassDecorator;
import Utils.Eyeglass;

/**
 * @author ajith.athithyan
 * @project Decorator-pattern
 */
public class AviatorGlass extends EyeglassDecorator {
    private String color;
    private String frameType;
    public AviatorGlass(Eyeglass eyeglass,String color,String frameType)
    {
        super(eyeglass);
        this.color=color;
        this.frameType=frameType;
    }

    public String glassShape() {
        return "Frame brand: Aviator " +"\nFrame shape: " + super.eyeglass.glassShape()+"\nFrame type: "+ frameType+"\nFrame color: "+color+"";
    }

    public Float glassPrice()
    {
        return super.glassPrice()+2000;
    }


}
