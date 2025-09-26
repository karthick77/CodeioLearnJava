package Assignment_3;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: "+amount+" New Balance: "+balance);
        }else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdraw: "+amount+" New Balance: "+balance);
        }else{
            System.out.println("Invalid withrawal! Either insufficient balance or negative amount.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("AC101");
        acc1.deposit(2000);
        acc1.withdraw(1800);
        acc1.deposit(500);
        acc1.withdraw(800);

        BankAccount acc2 = new BankAccount("AC104",9000);
        acc2.deposit(2000);
        acc2.withdraw(10000);
        acc2.deposit(500);
        acc2.withdraw(1800);
    }
}
