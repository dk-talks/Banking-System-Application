
public class Main {
    public static void main(String[] args) {

        Account ac1 = new Account("Mukesh Singh");


    }

    private void welcomeScreen() {
        System.out.println("Welcome to SBI Bank Portal, How may we help you?");
        System.out.println("Choose option below to go further.");
        System.out.println("1.Create a new account.");
        System.out.println("2.Know your Account Details.");
        System.out.println("3.Deposit Amount.");
        System.out.println("4.Withdraw Amount.");
        System.out.println("5.Exit");

    }
}
