import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of courses: ");

        
        String[] gradeList = new String[4];
        System.out.print("Enter your grades: ");
        for (int i = 0; i < 4; i++) {
            gradeList[i] = sc.nextLine();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(gradeList[i]);
        }
    }
}
