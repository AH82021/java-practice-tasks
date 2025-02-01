package tasks;

/**
 * Task: Classes & Objects (Practical Example)
 *
 * Title: **Car Management System**
 *
 * Goal:
 * - **Understand the fundamentals of classes and objects in Java** by creating a `Car` class.
 * - **Practice creating objects**, accessing fields, and invoking methods to manipulate object state.
 *
 * Overview:
 * In this task, you will design and implement a simple **Car Management System** using Java's object-oriented programming (OOP) principles. This exercise will help you grasp how to define a class with attributes (fields) and behaviors (methods), instantiate objects from that class, and interact with those objects to perform various actions.
 *
 * Task Description:
 * You are to create a `Car` class that models real-world cars with specific attributes and behaviors. Then, using this class, you will create multiple `Car` objects and demonstrate their interactions through various methods.
 *
 * Step-by-Step Guidance:
 *
 * 1. **Define the `Car` Class**
 *
 *    - **Fields (Attributes):**
 *      - `make` (String): The manufacturer of the car (e.g., Toyota, Honda).
 *      - `model` (String): The specific model of the car (e.g., Camry, Civic).
 *      - `year` (int): The production year of the car.
 *      - `color` (String): The color of the car.
 *      - `mileage` (double): The current mileage of the car.
 *
 *    - **Constructor:**
 *      - Initialize all the fields when a new `Car` object is created.
 *        ```java
 *        public Car(String make, String model, int year, String color, double mileage) {
 *            this.make = make;
 *            this.model = model;
 *            this.year = year;
 *            this.color = color;
 *            this.mileage = mileage;
 *        }
 *        ```
 *
 *    - **Methods (Behaviors):**
 *      - `startEngine()`: Simulates starting the car's engine by printing a relevant message.
 *      - `stopEngine()`: Simulates stopping the car's engine by printing a relevant message.
 *      - `drive(double miles)`: Increases the car's mileage by the specified miles and prints the updated mileage.
 *      - `repaint(String newColor)`: Changes the car's color to `newColor` and prints the new color.
 *      - `displayInfo()`: Prints all the car's details, including make, model, year, color, and mileage.
 *
 * 2. **Implement the `Car` Class**
 *
 *    - **Encapsulation:**
 *      - Keep all fields `private` to protect the internal state of the object.
 *      - Provide `public` methods to interact with these fields, ensuring controlled access and modification.
 *
 *    - **Constructor Implementation:**
 *      - Use the constructor to set the initial state of the `Car` object with the provided parameters.
 *
 *    - **Method Implementation:**
 *      - **`startEngine()` and `stopEngine()`:** These methods should print messages indicating the engine's status.
 *      - **`drive(double miles)`:**
 *        - Validate that `miles` is a positive number.
 *        - Increment the `mileage` by `miles`.
 *        - Print the updated mileage.
 *      - **`repaint(String newColor)`:**
 *        - Validate that `newColor` is not null or empty.
 *        - Update the `color` field with `newColor`.
 *        - Print the new color.
 *      - **`displayInfo()`:**
 *        - Print all the car's attributes in a readable format.
 *
 * 3. **Demonstrate Usage in the `main` Method**
 *
 *    - **Instantiate `Car` Objects:**
 *      - Create at least two `Car` objects with different attributes.
 *        ```java
 *        Car car1 = new Car("Toyota", "Camry", 2020, "Red", 15000.5);
 *        Car car2 = new Car("Honda", "Civic", 2018, "Blue", 30000.0);
 *        ```
 *
 *    - **Interact with the Objects:**
 *      - Call the `startEngine()`, `drive()`, `repaint()`, and `displayInfo()` methods on each object.
 *        ```java
 *        car1.startEngine();
 *        car1.drive(120.5);
 *        car1.repaint("Black");
 *        car1.displayInfo();
 *
 *        car2.startEngine();
 *        car2.drive(200.0);
 *        car2.stopEngine();
 *        car2.displayInfo();
 *        ```
 *
 * 4. **Test Various Scenarios**
 *
 *    - **Valid Operations:**
 *      - Driving positive miles should correctly update and display the mileage.
 *      - Repainting with a valid color should change the car's color.
 *      - Starting and stopping the engine should print appropriate messages.
 *
 *    - **Invalid Operations:**
 *      - Attempting to drive negative miles should prompt an error message.
 *      - Repainting with an invalid color (e.g., empty string) should prompt an error message.
 *      - Ensure that the program handles null or empty inputs gracefully.
 *
 * 5. **Optional Enhancements**
 *
 *    - **Additional Attributes:**
 *      - Add fields like `fuelLevel`, `engineType`, or `transmission` to provide more depth to the `Car` class.
 *
 *    - **Additional Methods:**
 *      - Implement methods like `refuel(double liters)` to increase the fuel level or `changeTransmission(String type)` to switch between automatic and manual transmissions.
 *
 *    - **Input Validation:**
 *      - Enhance methods to prevent invalid data entries, such as negative mileage or invalid color names.
 *
 * Key Concepts:
 *
 * - **Classes and Objects:**
 *   - A **class** is a blueprint for creating objects, encapsulating data for the object and methods to manipulate that data.
 *   - An **object** is an instance of a class, having its own set of attributes and behaviors.
 *
 * - **Encapsulation:**
 *   - Protects the internal state of an object by keeping fields `private` and exposing `public` methods for controlled access and modification.
 *
 * - **Constructors:**
 *   - Special methods used to initialize new objects. They set the initial state of an object when it is created.
 *
 * - **Methods:**
 *   - Define the behaviors of objects. They can perform actions, modify the object's state, or return information about the object.
 *
 * Tips for Success:
 *
 * - **Start Simple:**
 *   - Begin by defining the class with its fields and constructor before adding methods.
 *
 * - **Incremental Development:**
 *   - Implement and test one method at a time to ensure each part works correctly before moving on.
 *
 * - **Validate Inputs:**
 *   - Always check for invalid inputs in methods to maintain the integrity of the object's state.
 *
 * - **Consistent Naming:**
 *   - Use clear and consistent naming conventions for classes, methods, and variables to enhance code readability.
 *
 * - **Document Your Code:**
 *   - Comment your code to explain the purpose of classes, methods, and complex logic. This practice aids in understanding and maintenance.
 *
 * - **Test Thoroughly:**
 *   - After implementing each method, test it with various inputs to ensure it behaves as expected.
 *
 * Example Scenario (Without Code):
 *
 * 1. **Creating Car Objects:**
 *    - You create two cars: a red 2020 Toyota Camry with 15,000.5 miles and a blue 2018 Honda Civic with 30,000.0 miles.
 *
 * 2. **Interacting with `car1` (Toyota Camry):**
 *    - **Start Engine:** The engine starts, and a message is printed.
 *    - **Drive:** You drive the car for 120.5 miles. The mileage updates to 15,121.0 miles, and a message is printed.
 *    - **Repaint:** You repaint the car to black. The color changes to black, and a message is printed.
 *    - **Display Info:** All details of the car are printed, showing the updated color and mileage.
 *
 * 3. **Interacting with `car2` (Honda Civic):**
 *    - **Start Engine:** The engine starts, and a message is printed.
 *    - **Drive:** You drive the car for 200.0 miles. The mileage updates to 30,200.0 miles, and a message is printed.
 *    - **Stop Engine:** The engine stops, and a message is printed.
 *    - **Display Info:** All details of the car are printed, showing the updated mileage.
 *
 * Final Notes:
 *
 * - **Practice Regularly:**
 *   - The more you work with classes and objects, the more comfortable you'll become with OOP concepts.
 *
 * - **Experiment:**
 *   - Try adding more features or creating additional classes that interact with `Car` objects to deepen your understanding.
 *
 * - **Seek Feedback:**
 *   - Share your code with peers or instructors to receive feedback and improve your implementation.
 *
 * - **Refer to Documentation:**
 *   - Utilize Java's official documentation and other resources to explore more about classes, objects, and OOP principles.
 *
 * **Happy Coding!** 🚗✨
 */
public class Task_ClassesAndObjects {
    public class Car {
        private String make;
        private String model;
        private int year;
        private String color;
        private double mileage;

        public Car(String make,String model,int year,String color,int mileage){
            this.make=make;
            this.model=model;
            this.year=year;
            this.color=color;
            this.mileage=mileage;
        }
        public Car(){}
        public void setMake(){
            this.make=make;
        }
        public void setModel(){
            this.model=model;
        }
        public void setColor(){
            this.color=color;
        }
        public void setYear(){
            this.year=year;
        }
        public void setMileage(){
            this.mileage=mileage;
        }

        public String getModel() {
            return model;
        }

        public String getMake(){
            return make;
        }
        public String getColor(){
            return color;
        }
        public int getYear(){
            return year;
        }
        public double getMileage(){
            return mileage;
        }

    }

    public static void main(String[] args) {
        // TODO: Create and test your Car objects here.

        // Example Usage:

        /*
        // Creating Car objects
        Car car1 = new Car("Toyota", "Camry", 2020, "Red", 15000.5);
        Car car2 = new Car("Honda", "Civic", 2018, "Blue", 30000.0);

        // Interacting with car1
        car1.startEngine();
        car1.drive(120.5);
        car1.repaint("Black");
        car1.displayInfo();

        // Interacting with car2
        car2.startEngine();
        car2.drive(200.0);
        car2.stopEngine();
        car2.displayInfo();
        */
    }
}

/**
 * Class: Car
 *
 * Description:
 *   Represents a car with basic attributes and behaviors.
 */
