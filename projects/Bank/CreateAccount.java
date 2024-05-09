public class CreateAccount {
    private String accountName;
    static double accountBalance = 0;
    
    // Constructor
    CreateAccount(String accountName) {
        this.accountName = accountName;
    }

    // Get and set for Account's name
    public String getAccountName() {
        return this.accountName
    }

    public void setAccountName(String newAccountName) {
        this.accountName = newAccountName;
    }

    // Get and set for Account's Balance
    public double getBalance() {
        return this.accountBalance;
    }

    public void setBalance(String operation, double amount) {
        if(operation == "Withdraw") {
            if(this.accountBalance >= amount) {
                this.withdraw(amount);
            } else {
                System.out.println("Operation failed. Error: cannot withdraw, amount is bigger than balance");
            }
        } else if(operation == "Add") {
            this.add(amount);
        }
    }

    // withdraw and add operations    
    private void withdraw(double amount) {
        this.accountBalance -= amount;
    }

    private void add(double amount) {
        this.accountBalance += amount;
    }
}