package lab_04;

public class task3 {
    public static void main(String[] args) {
        int[][] mat = {{3, 4, 9}, {4, 6, 0}, {2, 9, 11}};
        int[] sum_row = new int[3];
        int[] sum_col = new int[3];
        int sum_major = 0;
        int sum_minor = 0;

        // sum row
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum_row[i] = mat[i][j];
            }
        }
        for(int i = 0; i < 3; i++) {
            System.out.println("The sum of row " + i + " = " + sum_row[i]);
        }

        // sum col
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum_col[i] = mat[i][j];
            }
        }
        for(int i = 0; i < 3; i++) {
            System.out.println("The sum of col " + i + " = " + sum_col[i]);
        }

        // sum major
        for (int i = 0, j = 0; i < 3; i++, j++) {
            sum_major += mat[i][j];
        }
        System.out.println("The sum of major diagonal is " + sum_major);

        // sum minor
        for (int i = 0, j = 2; i < 3; i++, j--) {
            sum_minor += mat[i][j];
        }
        System.out.println("The sum of minor diagonal is " + sum_minor);
    }   
}
