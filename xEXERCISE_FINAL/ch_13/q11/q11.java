package ch_13.q11;

public class q11 {
    public static void main(String[] args) {
        Octagon ot1 = new Octagon(5);

        System.out.println("Area: " + ot1.getArea());
        System.out.println("Perimeter: " + ot1.getPerimeter());

        Octagon ot2 = null;
        
        try {
            ot2 = ot1.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Clone not possible");
        }

        System.out.println("Comapare: " + ot1.compareTo(ot2));
    }
}
