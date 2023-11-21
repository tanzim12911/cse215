package xEXERCISE_FINAL.Encapsulation.PointLine;

public class Line {
    private Point start;
    private Point end;

    public Line() {

    }
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    public Line(int x1, int y1, int x2, int y2) {
        this.start.setX(x1);
        this.start.setY(y1);

        this.end.setX(x2);
        this.end.setY(y2);
    }
    
    
    public Point getStart() {
        return start;
    }
    public void setStart(Point start) {
        this.start = start;
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public double length() {
        return start.distance(end);
    }
    @Override
    public String toString() {
        return "Line [start=" + start + ", end=" + end + "]";
    }

    
}
