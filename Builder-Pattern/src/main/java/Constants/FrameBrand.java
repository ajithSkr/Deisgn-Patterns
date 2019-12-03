package Constants;

import com.sun.tools.internal.jxc.model.nav.ApNavigator;

/**
 * @author ajith.athithyan
 * @project Design-Patterns
 */
public enum  FrameBrand {
    AVIATOR("Aviator"),
    RAYBAN("Rayban"),
    FASTTRACK("Fastrack");

    private String brand;

    FrameBrand(String brand)
    {
        this.brand=brand;
    }
    public String getBrand()
    {
        return this.brand;
    }
}
