import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Account ac1 = new Account("Mukesh Singh");
        welcomeScreen();

        while(true) {
            boolean doExit = false;
            System.out.print("Plase Enter your choice here: ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Account Holder Name: " + ac1.getAccountHolderName());
                    System.out.println("Accout Balance Remaining: " + ac1.getBalance());
                    System.out.println("Your Bank Account Number is: " + ac1.getAccountNumber());

                    break;
                case 2:
                    System.out.print("Enter Amount to Deposit: ");
                    int amount = sc.nextInt();
                    ac1.depositAmount(amount);
                    break;
                case 3:
                    System.out.print("Enter amount to Withdraw: ");
                    int withAmt = sc.nextInt();
                    ac1.withdrawAmount(withAmt);
                    break;
                default:
                    System.out.println("Visit Again!");
                    doExit = true;
                    break;

            }
            if(doExit) {
                break;
            }

        }

    }

    private static void welcomeScreen() {
        System.out.println("Welcome to SBI Bank Portal, How may we help you?");
        System.out.println("Choose option below to go further.");
        System.out.println("1.Know your Account Details.");
        System.out.println("2.Deposit Amount.");
        System.out.println("3.Withdraw Amount.");
        System.out.println("4.Exit");

    }
}
