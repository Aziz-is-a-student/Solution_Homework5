package Flyweight_Pattern;

public class MarkerStyle {
    private String color;
    private String icon;
    private String style;

    public MarkerStyle(String color, String icon, String style) {
        this.color = color;
        this.icon = icon;
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public String getIcon() {
        return icon;
    }

    public String getStyle() {
        return style;
    }

}
