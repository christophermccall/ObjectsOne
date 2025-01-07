package object1;

public class Chair {
    private String material;
    private String pattern;
    private int legs;
    private int width;
    private int height; // in cm


    public Chair(String material, String pattern, int height, int width, int legs){
        this.material = material;
        this.pattern = pattern;
        this.legs = legs;
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }


}
