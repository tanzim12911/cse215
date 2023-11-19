import java.util.Scanner;
import java.io.*;

public class Menu {

    private static final double CASHOUT_CRG = 0.0185;
    private static final int NUM_SIZE = 14;

    public static void menu() {
        int n;

        System.out.println("LenDen");

        System.out.println("1. Check Balance");
        System.out.println("2. Send Money");
        System.out.println("3. Mobile Recharge");
        System.out.println("4. Cash Out");
        System.out.println("5. Transaction History");
        System.out.println("6. Exit");

        do {
            System.out.println("\nChoose an option: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    double balance;
                    try {
                        FileReader balanceFile = new FileReader("balance.txt")
                        Scanner scanner = new Scanner(balanceFile);
                        balance = scanner.nextDouble();
                    } catch (IOException e) {
                        System.out.println("Unable to open the file.");
                        return;
                    }

                    System.out.println("\nYour Current Balance: BDT " + balance);
                    break;

                case 2:
                    double sendAmount;
                    String receiverAccountNo;

                    System.out.println("\nEnter Receiver Account No: ");
                    receiverAccountNo = ScannerUtils.nextString();
                    System.out.println("Enter the Amount: ");
                    sendAmount = ScannerUtils.nextDouble();

                    updateBalance(sendAmount);

                    // save transaction details
                    try (FileWriter transactionFile = new FileWriter("transaction.txt", true)) {
                        transactionFile.write("BDT " + sendAmount + " Send Money to " + receiverAccountNo + "\n");
                    } catch (IOException e) {
                        System.out.println("Unable to open the file.");
                        return;
                    }

                    System.out.println("\nMoney sent successfully!");
                    break;

                case 3:
                    double rechargeAmount;
                    String mobileNumber;

                    System.out.println("\nEnter Mobile Number: ");
                    mobileNumber = ScannerUtils.nextString();
                    System.out.println("Enter Recharge Amount: ");
                    rechargeAmount = ScannerUtils.nextDouble();

                    updateBalance(rechargeAmount);

                    // save transaction details
                    try (FileWriter transactionFile = new FileWriter("transaction.txt", true)) {
                        transactionFile.write("BDT " + rechargeAmount + " Recharge to " + mobileNumber + "\n");
                    } catch (IOException e) {
                        System.out.println("Unable to open the file.");
                        return;
                    }

                    System.out.println("\nMobile recharge successful!");
                    break;

                case 4:
                    double cashOutAmount, charge;
                    String agentNumber;

                    System.out.println("\nEnter Agent Number: ");
                    agentNumber = ScannerUtils.nextString();
                    System.out.println("Enter Cash Out Amount: ");
                    cashOutAmount = ScannerUtils.nextDouble();

                    charge = cashOutAmount * CASHOUT_CRG;

                    System.out.println("Cash Out Charge: BDT " + charge);

                    cashOutAmount += charge;

                    updateBalance(cashOutAmount);

                    // save transaction details
                    try (FileWriter transactionFile = new FileWriter("transaction.txt", true)) {
                        transactionFile.write("BDT " + cashOutAmount + " Cash Out from " + agentNumber + "\n");
                    } catch (IOException e) {
                        System.out.println("Unable to open the file.");
                        return;
                    }

                    System.out.println("\nCash out successful!");
                    break;

                case 5:
                    System.out.println("\nTransaction History:");

                    try (FileReader transactionFile = new FileReader("transaction.txt")) {
                        Scanner scanner = new Scanner(transactionFile);
                        while (scanner.hasNextLine()) {
                            System.out.println(scanner.nextLine());
                        }
                    } catch (IOException e) {
                        System.out.println("Unable to open the file.");
                    }
                    break;

                case 6:
                    System.out.println("\nExiting the program.");
                    break;

                default:
                    System.out.println("Invalid option.");
