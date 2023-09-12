package ch_09.q13;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        double[][] array = new double[row][col];

        System.out.println("Enter the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextDouble();
            }
        }

        Location location = Location.locateLargest(array);

        /*To address the question of why: In Java, when you declare something as static, 
        you are saying that it is a member of the class, not the object (hence why there is only one). 
        Therefore it doesn't make sense to access it on the object, because that particular data member 
        is associated with the class. */

        System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.col + ")");

    }
    

    
    
}
