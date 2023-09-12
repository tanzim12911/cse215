package ch_09.q13;

public class Location {
    public int row;
    public int col;
    public double maxValue;

    public static Location locateLargest(double[][] a) {
        Location location = new Location();  
        location.maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (location.maxValue < a[i][j]) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.col = j;
                }
                    
            }
        }

        return location;
    }
}
