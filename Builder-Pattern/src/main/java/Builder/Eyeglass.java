package Builder;

/**
 * @author ajith.athithyan
 * @project Design-Patterns
 */
public class Eyeglass {

    private final String brand;
    private final String shape;
    private final String color;
    private final String type;
    private final float prize;

    public static class Eyeglassbuilder {
        private String brand;
        private String shape;
        private String color;
        private String type;
        private float prize;

        public Eyeglassbuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Eyeglassbuilder withShape(String shape) {
            this.shape = shape;
            return this;
        }

        public Eyeglassbuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public Eyeglassbuilder withType(String type) {
            this.type = type;
            return this;
        }


        public Eyeglassbuilder withPrize(Float prize) {
            this.prize = prize;
            return this;
        }

        public Eyeglass build() {
            return new Eyeglass(this);
        }
    }

    private Eyeglass(Eyeglassbuilder eyeglassbuilder) {
        this.brand = eyeglassbuilder.brand;
        this.shape = eyeglassbuilder.shape;
        this.color = eyeglassbuilder.color;
        this.type = eyeglassbuilder.type;
        this.prize = eyeglassbuilder.prize;
    }

    @Override
    public String toString() {
        return "Frame brand: " + brand + "" + "\nFrame shape: " + shape + "\nFrame type: " + type + "\nFrame color: " + color + "\nFrame prize: " + prize + "";
    }


}
