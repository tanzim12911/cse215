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
    
        int[] col_sum = new int[4];
        int col_index = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                col_sum[i] += mat[j][i];
            }    
        }

        for (int i = 0; i < col_sum.length - 1; i++) {
            if (col_sum[i] < col_sum[i + 1])
                col_index = i + 1;
        }
        
        int[] row_sum = new int[4];
        int row_index = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                row_sum[i] += mat[i][j];
            }    
        }

        for (int i = 0; i < row_sum.length - 1; i++) {
            if (row_sum[i] < row_sum[i + 1])
                row_index = i + 1;
        }

        System.out.println("The largest row index: " + row_index);
        System.out.println("The largest column index: " + col_index);
        
    }
}

