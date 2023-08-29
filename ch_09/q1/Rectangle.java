package ch_09.q1;

public class Rectangle {
    double width;
    double height;

    Rectangle () {

    }

    Rectangle (double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }


}
