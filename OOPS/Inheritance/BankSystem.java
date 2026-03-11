package OOPS.Inheritance; 

class Account {

    private int accNo;
    private String name;
    private String address;
    private String dob;
    private String phone;
    private double balance;

    public Account(int accNo, String name, String address, String dob, String phone, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.phone = phone;
        this.balance = balance;
    }

    // getters
    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // setters for mutable info
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // controlled balance modification
    protected void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    protected void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }

    }

    public String toString() {
        return "\nAccount No: " + accNo +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nDOB: " + dob +
                "\nPhone: " + phone +
                "\nBalance: " + balance;
    }
}


class SavingAccount extends Account {

    private double minBalance = 1000;

    public SavingAccount(int accNo, String name, String address, String dob, String phone, double balance) {
        super(accNo, name, address, dob, phone, balance);
    }

    public void depositMoney(double amount) {
        deposit(amount);
    }

    public void withdrawMoney(double amount) {

        if (getBalance() - amount >= minBalance) {
            withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance must remain: " + minBalance);
        }

    }

    public void viewBalance() {

        System.out.println("Current Balance: " + getBalance());
        System.out.println("Minimum Balance Required: " + minBalance);
        System.out.println("Available for Withdrawal: " + (getBalance() - minBalance));

    }

}


class LoanAccount extends Account {

    private double loanAmount;

    public LoanAccount(int accNo, String name, String address, String dob, String phone, double balance, double loanAmount) {
        super(accNo, name, address, dob, phone, balance);
        this.loanAmount = loanAmount;
    }

    public void payEMI(double amount) {

        if (amount > loanAmount) {

            double extra = amount - loanAmount;
            loanAmount = 0;

            deposit(extra);

            System.out.println("Loan fully paid.");
            System.out.println("Extra amount added to balance: " + extra);

        } else {

            loanAmount -= amount;
            System.out.println("EMI paid: " + amount);
        }

    }

    public void topUpLoan(double amount) {

        loanAmount += amount;
        System.out.println("Loan increased by: " + amount);

    }

    public void repayLoan() {

        loanAmount = 0;
        System.out.println("Loan fully repaid");

    }

    public double getLoanAmount() {
        return loanAmount;
    }

}


public class BankSystem {

    public static void main(String[] args) {

        SavingAccount s = new SavingAccount(
                101,
                "Tanishka",
                "Bangalore",
                "01-01-2003",
                "9999999999",
                5000
        );

        System.out.println(s);

        s.depositMoney(2000);
        s.withdrawMoney(3000);
        s.viewBalance();


        System.out.println("\n--- Loan Account ---");

        LoanAccount l = new LoanAccount(
                201,
                "Riya",
                "Delhi",
                "02-02-2000",
                "8888888888",
                3000,
                10000
        );

        l.payEMI(12000);

        System.out.println("Loan Remaining: " + l.getLoanAmount());
        System.out.println("Account Balance: " + l.getBalance());

    }
}