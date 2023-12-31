package xEXERCISE_FINAL.Polymorphism.PlantHerbFlower;

public class Plant {
    private String name;
    private String color;
    
    Plant() {
    }
    Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Plant [name=" + name + ", color=" + color + "]";
    }

    

    
}
