package ch_12.q5;

public class IllegalTriangleException extends Exception {
    IllegalTriangleException (String s) {
        super(s);
    }
    IllegalTriangleException(Throwable cause) {
        super(cause);
    }
}
