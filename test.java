import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of courses: ");

        
        String[] gradeList = new String[courseNum];
        System.out.print("Enter your grades: ");
        for (int i = 0; i < courseNum; i++) {
            gradeList[i] = sc.nextLine();
        }
        for (int i = 0; i < courseNum; i++) {
            System.out.println(gradeList[i]);
        }
    }
}
