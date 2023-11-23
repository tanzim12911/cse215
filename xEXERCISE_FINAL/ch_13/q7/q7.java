package xEXERCISE_FINAL.ch_13.q7;

public class q7 {
    public static void main(String[] args) {
        GeometricObject[] gmtObj = new GeometricObject[5];

        for (int i = 0; i < gmtObj.length; i++) {
            gmtObj[i] = new Square(Math.random() * 100);
        }

        for (int i = 0; i < gmtObj.length; i++) {
            if (gmtObj[i] instanceof Square) {
                Square sq = (Square) gmtObj[i];
                System.out.println("Side: " + sq.getSide() + " & Area: " + sq.getArea());
                sq.howToColor();
            }
        }
    }
}
