package ch_13.q7;

import ch_11.q1.GeometricObject;

public class q7 {
    public static void main(String[] args) {
        GeometricObject[] objArr = new GeometricObject[5];

        for (int i = 0; i < 5; i++) {
            objArr[i] = new Square();
            System.out.println(objArr[i].get);
        }
    }
}
