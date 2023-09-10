package lab_03;

public class task5b {
    public static void main(String[] args) {
        int upper = (int) (1 + Math.random() * (1000 - 1 + 1));
        int lower = (int) (1 + Math.random() * (1000 - 1 + 1));

        if (upper < lower) {
            int temp = upper;
            upper = lower;
            lower = temp;
        }

        int i = lower;
        while(i <= upper) {
            if(i % 5 == 0 || i % 8 == 0)
                System.out.print(i + " ");
            
            i++;
        }
    }
}
