import java.util.Random;

public class Account {
    private long balance;
    private String accountHolderName;
    private String accountNumber;

    public Account(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateAccountNumber();
        this.balance = 0;
    }

    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }

        return sb.toString();
    }

    public long getBalance() {
        return balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }


    public void depositAmount(long amount) {
        balance += amount;
        System.out.println("Your Account has been credited with INR " + amount);
        System.out.println("Updated Balance is INR " + balance);
    }

    public void withdrawAmount(long amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Your Account is Withdrawn with Amount INR " + amount);
            System.out.println("Remaining Balance is INR " + balance);
        } else {
            System.out.println("Insufficient Balance in your Account.");
        }
    }



}
