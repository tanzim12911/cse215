package ch_13.q7;

import ch_11.q1.GeometricObject;

public class Square extends GeometricObject implements Colorable {
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    
}
