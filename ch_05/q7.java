package ch_05;

public class q7 {
    public static void main(String[] args) {
        
        double tuition_fee = 10000, total_fee = 0;

        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Tuition fee for year " + i + " is $" + tuition_fee);
            tuition_fee = tuition_fee + tuition_fee * 0.05;
            total_fee += tuition_fee;
        }
    }
}
