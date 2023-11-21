package xEXERCISE_FINAL.Inheritance.Geometry;

import java.util.Date;

public class GeometricObject {
    private String color = "White"; // setting white as default color
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color; // “this” refers to the current object
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "Created on: " + dateCreated + " Color: " + color + " Filled: " + filled;
    }
}
