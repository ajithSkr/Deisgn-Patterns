package Main;

import Builder.Eyeglass;
import Constants.FrameBrand;
import Constants.FrameColor;
import Constants.FrameType;

/**
 * @author ajith.athithyan
 * @project Design-Patterns
 */
public class GetEyeGlass {


    public static void main(String args[]) {
        Eyeglass eyeglass = new Eyeglass.Eyeglassbuilder()
                .withBrand(FrameBrand.AVIATOR.getBrand())
                .withColor(FrameColor.BLUE.getColor())
                .withShape("Square")
                .withType(FrameType.HALFRIM.getFrameType())
                .withPrize(120f).build();
        System.out.println(eyeglass);
    }

}
