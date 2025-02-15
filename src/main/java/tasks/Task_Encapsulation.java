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
 *      - Example: The getter for `balance` can simply return the current balance.
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

    public static void main(String[] args) {
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
