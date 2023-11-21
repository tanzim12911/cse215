package xEXERCISE_FINAL.Polymorphism.PlantHerbFlower;

public class Flower extends Plant {
    private boolean hasSmell;
    private boolean hasThorn;

    Flower() {
    }
    Flower(boolean hasSmell, boolean hasThorn) {
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }
    Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
        super(name, color);
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }
    public boolean isHasSmell() {
        return hasSmell;
    }
    public void setHasSmell(boolean hasSmell) {
        this.hasSmell = hasSmell;
    }
    public boolean isHasThorn() {
        return hasThorn;
    }
    public void setHasThorn(boolean hasThorn) {
        this.hasThorn = hasThorn;
    }
    @Override
    public String toString() {
        return "Flower [name=" + getName() + ", color=" + getColor() + ", hasSmell=" + hasSmell + ", hasThorn=" + hasThorn + "]";
    }
    
}
