import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read the numbers into the array
        System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Iterate through the array and check for consecutive numbers
        for (int i = 0; i < size - 2; i++) {
            if (numbers[i] == numbers[i + 1] - 1 && numbers[i] == numbers[i + 2] - 2) {
                System.out.print(numbers[i] + " ");
            }
        }

        scanner.close();
    }
}
