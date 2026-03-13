package task5;



public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, "John Doe", 500.0);

        System.out.println("Balance: " + account.getBalance());

        account.deposit(200.0);
        System.out.println("After depositing 200, Balance: " + account.getBalance());

        try {
            account.withdraw(100.0);
            System.out.println("After withdrawing 100, Balance: " + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            account.withdraw(9999.0);
            System.out.println("After withdrawing 9999, Balance: " + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


