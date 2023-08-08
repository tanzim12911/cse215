import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers (end with 0):");
        
        int input = scanner.nextInt();
        while (input != 0) {
            System.out.println("You entered: " + input);
            input = scanner.nextInt();
        }
        
        System.out.println("Program ended.");
    }
}

