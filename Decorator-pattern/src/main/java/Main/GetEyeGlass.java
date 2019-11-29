package Main;

import Constants.FrameColor;
import Constants.FrameType;
import FrameBrands.AviatorGlass;
import FrameBrands.FastrackGlass;
import FrameBrands.RayBanGlass;
import Utils.Eyeglass;
import Utils.FrameTypes.CircleFrame;
import Utils.FrameTypes.RectangleFrame;
import Utils.FrameTypes.SquareFrame;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ajith.athithyan
 * @project Decorator-pattern
 */
public class GetEyeGlass {


    public static String frameType() {

        System.out.println("------Available types-----");
        System.out.println("1. " + FrameType.HALFRIM.getFrameType());
        System.out.println("2. " + FrameType.FULLRIM.getFrameType());
        System.out.println("3. " + FrameType.RIMLESS.getFrameType());
        System.out.println("Select a the type ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        String frameType = null;
        switch (option) {
            case 1:
                frameType = FrameType.HALFRIM.getFrameType();
                break;
            case 2:
                frameType = FrameType.FULLRIM.getFrameType();
                break;
            case 3:
                frameType = FrameType.RIMLESS.getFrameType();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        return frameType;

    }

    public static String frameColor() {
        String frameColor = null;
        System.out.println("------Available colors-----");
        System.out.println("1. " + FrameColor.GREEN.getColor());
        System.out.println("2. " + FrameColor.BLUE.getColor());
        System.out.println("3. " + FrameColor.YELLOW.getColor());
        System.out.println("4. " + FrameColor.RED.getColor());
        System.out.println("5. " + FrameColor.WHITE.getColor());
        System.out.println("Select a color");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        switch (option) {
            case 1:
                frameColor = FrameColor.GREEN.getColor();
                break;
            case 2:
                frameColor = FrameColor.BLUE.getColor();
                break;
            case 3:
                frameColor = FrameColor.YELLOW.getColor();
                break;
            case 4:
                frameColor = FrameColor.RED.getColor();
                break;
            case 5:
                frameColor = FrameColor.WHITE.getColor();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        System.out.println("\n");
        return frameColor;


    }

    public static Eyeglass frameShape() {
        Eyeglass eyeglass = null;
        System.out.println("------Available shapes-----");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("Select a shape");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        switch (option) {
            case 1:
                eyeglass = new SquareFrame();
                break;
            case 2:
                eyeglass = new CircleFrame();
                break;
            case 3:
                eyeglass = new RectangleFrame();
                break;
            default:
                System.out.println("Please select the option above");
                break;
        }
        System.out.println("\n");
        return eyeglass;

    }

    public static List<String> frameData() {
        String rayBan = "Ray-Ban";
        String aviator = "Aviator";
        String fastTrack = "Fast Track";
        Eyeglass frameBrand = null;
        System.out.println("------Available Brands-----");
        System.out.println("1. " + rayBan);
        System.out.println("2. " + aviator);
        System.out.println("3. " + fastTrack);
        System.out.println("Select a brand");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        List<String> frameData = new LinkedList<String>();
        switch (option) {
            case 1:
                frameBrand = new RayBanGlass(frameShape(), frameColor(), frameType());
                break;
            case 2:
                frameBrand = new AviatorGlass(frameShape(), frameColor(), frameType());
                break;
            case 3:
                frameBrand = new FastrackGlass(frameShape(), frameColor(), frameType());
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        System.out.println("\n");
        System.out.println("--Order Summary--"+"\n");
        frameData.add(frameBrand.glassShape());
        frameData.add("Frame Price: " + frameBrand.glassPrice().toString()+"\n");
        return frameData;

    }

    public static void main(String args[]) {
        for (Object data : frameData()) {
            System.out.println(data);
        }

    }

}
