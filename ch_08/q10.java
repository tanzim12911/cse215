package ch_08;

public class q10 {
    public static void main(String[] args) {
        int[][] mat = new int[4][4]

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = (int) (Math.random());
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();    
        }
    }
}

