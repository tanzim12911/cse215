import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.println("Enter elements row by row:");
        int[][] mat = new int[n][n];
        int sumOfAll = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                sumOfAll += mat[i][j];
            }
        }
        
        int sumOfelementsUpperD = 0;
        int x = n - 1;
        for (int i = 0; i < n; i++, x--) {
            for (int j = x; j >= 0; j--) {
                sumOfelementsUpperD += mat[i][j];
            }
        }

        System.out.println(sumOfAll + " " + sumOfelementsUpperD);

        int result = sumOfAll - sumOfelementsUpperD;

        System.out.println("Result: " + result);
    }
}