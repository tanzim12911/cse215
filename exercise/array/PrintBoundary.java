package exercise.array;

public class PrintBoundary {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 } };
        
        PrintBoundaryMethod(a, 4, 4);
    }

    public static void PrintBoundaryMethod(int[][] array, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print(array[i][j] + " ");
                else if (j == 0)
                    System.out.print(array[i][j] + " ");
                else if (j == n - 1)
                    System.out.print(array[i][j] + " ");
                else if (i == m - 1)
                    System.out.print(array[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
