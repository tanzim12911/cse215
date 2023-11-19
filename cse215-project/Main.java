import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Client> clientList = new ArrayList<>();

        System.out.println("Welcome!");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        int choice;

        do {
            choice = sc.nextInt();

            if(choice == 1) {
                Login login = new Login();
            }
            else if(choice == 2) {
                Client client = new Client();
                
                System.out.print("Name: ");
                client.setName(sc.nextLine());

                System.out.print("Phone Number: ");

            }
            else if(choice == 3) {

            }
        } while (choice != 3);
    }
}
