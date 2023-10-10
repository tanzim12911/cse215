package ch_13.q7;

public class q7 {
    public static void main(String[] args) {
        GeometricObject[] listGO = new GeometricObject[5];

        for (int i = 0; i < listGO.length; i++) {
            listGO[i] = new Square(Math.random() * 100);
        }

        for (int i = 0; i < listGO.length; i++) {
            if (listGO[i] instanceof Square) {
                Square sq = (Square) listGO[i];
                System.out.println("Side: " + sq.getSide() + " AND Area: " + sq.getArea());
                sq.howToColor();
            }
        }
    }
}
