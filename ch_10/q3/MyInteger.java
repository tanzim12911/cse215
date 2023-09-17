package ch_10.q3;

public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if(value % 2 == 0)
            return true;

        return false;
    }

    public boolean isOdd() {
        if(value % 2 != 0)
            return true;

        return false;
    }

    public boolean isPrime() {
        
        for(int i = 2; i <= value / 2; i++) {
            if (value % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isEven(int num) {
        if(num % 2 == 0)
            return true;

        return false;
    }

    public static boolean isOdd(int num) {
        if(num % 2 != 0)
            return true;

        return false;
    }

    public static boolean isPrime(int num) {
        for(int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static isEven(MyInteger n) {
        return n.isEven();
    }



    
}