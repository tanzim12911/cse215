package ch_08;

public class q10 {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = (int) (Math.random() * 2);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();    
        }
    
        int col_sum_Large = mat[0][0] + mat[1][0] + mat[2][0] + mat[3][0];
        int col_sum = 0;
        int col_index = 0;

        for (int i = 0; i < 4; i++) {
                col_sum = mat[0][i] + mat[1][i] + mat[2][i] + mat[3][i];
            if (col_sum_Large < col_sum) {
                col_sum_Large = col_sum;
                col_index = i;
            }
        }
        
        int row_sum_Large = mat[0][1] + mat[0][2] + mat[0][3];
        int row_sum = 0;
        int row_index = 0;

        for (int i = 0; i < 4; i++) {
                row_sum = mat[i][0] + mat[i][1] + mat[i][2] + mat[i][3];
            if (row_sum_Large < col_sum) {
                row_sum_Large = col_sum;
                row_index = i;
            }
        }

        System.out.println("The largest row index: " + row_index);
        System.out.println("The largest column index: " + col_index);
        
    }
}

