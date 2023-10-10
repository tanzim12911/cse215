package ch_13.q10;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        color = "white";
        filled = false;
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return  "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    static GeometricObject max(GeometricObject o, GeometricObject o1) {
        if (o.compareTo(o1) == 1)
            return o;
        else
            return o1;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        }
        else if (this.getArea() == o.getArea()) {
            return 0;
        }
        else
            return -1;
    }
}
