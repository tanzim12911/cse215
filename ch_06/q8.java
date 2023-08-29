package ch_06;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        System.out.println("Celcius        Fahrenheit    |    Fahrenheit        Celcius");
        System.out.println("___________________________________________________________");
        double celsius = 40.0;
        double fahrenheit = 120.0;
        for (int i = 0; i < 10; i++) {
            System.out.println(celsius + "        " + celsiusToFahrenheit(celsius) + "                  " + fahrenheit + "        " + fahrenheitToCelsius(fahrenheit));
            celsius--;
            fahrenheit -= 10;
        }
        
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
