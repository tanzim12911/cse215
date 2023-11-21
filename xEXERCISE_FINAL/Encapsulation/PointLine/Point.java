package xEXERCISE_FINAL.Encapsulation.PointLine;

public class Point {
    private int x;
    private int y;

    public Point() {

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public double distance(Point point) {
        int x1 = this.x;
        int y1 = this.y;
        
        int x2 = point.getX();
        int y2 = point.getY();

        return Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));

    }

    
}
