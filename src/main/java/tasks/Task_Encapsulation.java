package tasks;

;

/**
 * Task: Encapsulation
 *
 * Title: "BankAccount" Class
 *
 * Goal:
 *   - Practice using private fields, public getters/setters, and controlled data manipulation
 *     methods (like deposit/withdraw).
 *
 * Guidance:
 *   1. **Create a `BankAccount` class** within this file (or a separate file if needed).
 *      - Use **private fields** for sensitive data, e.g.:
 *        - `private String accountNumber;`
 *        - `private double balance;`
 *
 *   2. **Provide public getters and setters** for these private fields, maintaining appropriate
 *      validation and data constraints.
 *      - Example: The setter for `accountNumber` can validate if the account format is correct.
 *  *   - Example: The getter for `balance` can simply return the current balance.
 *
 *
 *   3. **Implement the deposit and withdraw methods**:
 *      - `deposit(double amount)`:
 *        - Increase the balance by `amount`.
 *        - Validate that `amount` is not negative or zero.
 *      - `withdraw(double amount)`:
 *        - Decrease the balance by `amount`.
 *        - Validate that the balance remains non-negative after withdrawal.
 *
 *   4. **Test the `BankAccount` class**:
 *      - In the `main` method (or a dedicated test class), create at least one `BankAccount` object.
 *      - Test various scenarios:
 *        - Valid deposits and withdrawals.
 *        - Edge cases like depositing 0 or negative amounts.
 *        - Attempting to withdraw more than the current balance.
 *      - Print relevant information to confirm that encapsulation logic is working as intended.
 *
 * Note for New Java Students:
 *   - Encapsulation is about **information hiding** and **controlled access** to object data.
 *   - By using private fields, you protect the internal representation from direct access.
 *   - Getters and setters give you control over how these fields are changed or retrieved.
 *   - Always validate inputs inside setters or methods like `deposit` and `withdraw` to ensure
 *     data integrity (e.g., no negative balance).
 *
 * Method Signatures (You May Use or Modify):
 *   - public String getAccountNumber()
 *   - public void setAccountNumber(String accountNumber)
 *   - public double getBalance()
 *   - public void deposit(double amount)
 *   - public void withdraw(double amount)
 *
 * No solution is provided here; you must implement the logic as an exercise.
 */
public class Task_Encapsulation {
    public static class BankAcount{

        // instance variable

         private String accountNumber;
         private double balance;

        public BankAcount() {

        }

        // create constructor parameterized

        @Override
        public String toString() {
            return "BankAcount{" +
                    "accountNumber='" + accountNumber + '\'' +
                    ", balance=" + balance +
                    '}';
        }

        public BankAcount(String accountNumber, double balance){
            this.accountNumber=accountNumber;
            this.balance=balance;


        }

        // getter


        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }
        //setter


        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        //deposite methode
        public void deposite(double amount){
            if (amount>0){
                balance = amount+balance;//increased the amount here
            }
        }

        // withdrow methode
        public void withdraw(double amount){
            if (amount<=0){
                balance = amount - balance;
            } else {
                System.out.println("declined");
            }
        }

    }

    public static void main(String[] args) {
        BankAcount myAccount = new BankAcount();
        //BankAcount myAccount2 = new BankAcount();
        System.out.println(myAccount);
        // System.out.println(myAccount2);
        //Testing valid deposit
        myAccount.deposite( 3000 );
        System.out.println("new balance:"+ myAccount.getBalance());
        //Testing valid withdrawal
        myAccount.withdraw( 400 );
        System.out.println("remaining balance:"+myAccount.getBalance());
        //testing depositing 0
        myAccount.deposite( 0 );
        System.out.println("balance:"+myAccount.getBalance());
        //testing negative amount
        myAccount.deposite( -800 );
        System.out.println("remain balance:"+myAccount.getBalance());
        //testing more than current balance
        myAccount.withdraw( 4000 );
        System.out.println("balance:"+ myAccount.getBalance());


        // TODO: Create and test your BankAccount class here or in a separate file.




        // Example (pseudo-code):
        /*
        BankAccount account = new BankAccount();
        account.setAccountNumber("1234567890");
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance());
        */
    }
}
