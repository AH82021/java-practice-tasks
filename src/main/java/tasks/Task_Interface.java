package tasks;

/**
 * Task: Interface Implementation Practice
 *
 * Title: **Understanding and Implementing Interfaces in Java**
 *
 * Goal:
 * - **Understand and implement Java interfaces.**
 * - **Practice defining and implementing interfaces** in different classes.
 *
 * Overview:
 * In this task, you will create an interface with multiple method declarations and implement it in different classes.
 * This will help reinforce the concept of abstraction and polymorphism.
 *
 * Instructions:
 * - Define an interface with method declarations (no implementations).
 * - Create multiple classes that implement the interface.
 * - Provide method implementations in each class.
 * - Use a `main` method to demonstrate polymorphism.
 *
 * Note:
 * - Interfaces cannot have instance variables but can have `public static final` constants.
 * - All methods in an interface are `public` and `abstract` by default.
 */
public interface Task_Interface {

    /**
     * Task 1: Define an Interface
     *
     * Description:
     * - Define an interface with a few method signatures that classes must implement.
     *
     * TODO:
     * - Declare methods without implementation.
     */

    // Method to start a task
    void startTask();

    // Method to execute a task
    void executeTask();

    // Method to complete a task
    void completeTask();

    // Method to get task details
    String getTaskDetails();
}

/**
 * Task 2: Implement the Interface in a Class
 *
 * Description:
 * - Implement the interface in a class and provide method implementations.
 */
class BasicTask implements Task_Interface {

    @Override
    public void startTask() {
        // TODO: Implement logic to start a task
    }

    @Override
    public void executeTask() {
        // TODO: Implement logic to execute a task
    }

    @Override
    public void completeTask() {
        // TODO: Implement logic to complete a task
    }

    @Override
    public String getTaskDetails() {
        // TODO: Return task details as a string
        return "Basic Task Details";
    }
}

/**
 * Task 3: Implement the Interface in Another Class
 *
 * Description:
 * - Create another class that implements the interface differently.
 */
class AdvancedTask implements Task_Interface {

    @Override
    public void startTask() {
        // TODO: Implement advanced logic to start a task
    }

    @Override
    public void executeTask() {
        // TODO: Implement advanced logic to execute a task
    }

    @Override
    public void completeTask() {
        // TODO: Implement advanced logic to complete a task
    }

    @Override
    public String getTaskDetails() {
        // TODO: Return advanced task details as a string
        return "Advanced Task Details";
    }
}

/**
 * Task 4: Demonstrate Polymorphism
 *
 * Description:
 * - Use a main method to create instances of both classes and call interface methods.
 */
class TaskDemo {
    public static void main(String[] args) {
        // TODO: Instantiate objects and call interface methods

        Task_Interface task1 = new BasicTask();
        Task_Interface task2 = new AdvancedTask();

        task1.startTask();
        task1.executeTask();
        task1.completeTask();
        System.out.println(task1.getTaskDetails());

        task2.startTask();
        task2.executeTask();
        task2.completeTask();
        System.out.println(task2.getTaskDetails());
    }
}

