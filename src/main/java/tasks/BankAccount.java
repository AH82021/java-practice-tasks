package tasks;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public void setAccountNumber(){
        this.accountNumber=accountNumber;
    }
    public BankAccount(){

    }
    public void deposit(double amount){
        balance +=amount;
        System.out.println("deposit"+ amount +"remaining balance"+balance);
    }
    public void withrawbalance(double amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println("withraw amount"+amount+"remainig balance"+balance);
        }
    }
    public void setBalance(){
        this.balance=balance;
    }
    public String getAccountNumber(String number){
        return accountNumber;
    }
    public double getBalance() {
        return balance;

    }


}
