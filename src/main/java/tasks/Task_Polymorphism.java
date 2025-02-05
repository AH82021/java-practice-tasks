package tasks;


/**
 * Task: Polymorphism (Practical Example)
 *
 * Title: "Shape Interface and Subclasses"
 *
 * Goal:
 *   - Practice polymorphism by defining an interface with a common method and creating
 *     multiple subclasses that implement it differently.
 *
 * Guidance:
 *   1. **Create an interface `Shape`** with at least one method, for example:
 *       - `void draw();`
 *       - (Optional) `double area();` to calculate area.
 *
 *   2. **Create two or more classes** that implement `Shape`, such as:
 *       - `Circle` (with a `radius` field)
 *       - `Rectangle` (with `width` and `height` fields)
 *     Each class should:
 *       - Implement the `draw()` method to print a message describing the shape.
 *       - (Optional) Implement the `area()` method if you choose to add it to the interface.
 *
 *   3. **Demonstrate polymorphism in the `main` method**:
 *       - Create an array or list of `Shape` references: `Shape[] shapes = new Shape[2];`
 *       - Assign each element to a new `Circle` or `Rectangle` object:
 *         `shapes[0] = new Circle(5.0);`
 *         `shapes[1] = new Rectangle(4.0, 3.0);`
 *       - Loop through the array and call `draw()` on each object.
 *         - Observe how each object executes its own version of `draw()` even though
 *           they are both referenced as `Shape`.
 *       - (Optional) If you have an `area()` method, call it as well and print the result.
 *
 *   4. **Add more shapes** (e.g., `Triangle`, `Square`) for further practice.
 *
 * Note for New Java Students:
 *   - **Polymorphism** allows different classes to be accessed through a common interface.
 *   - The method call `draw()` will invoke the version defined by the object's actual class,
 *     even though you may have a reference of type `Shape`.
 *   - This mechanism is called **dynamic dispatch** or **runtime polymorphism** in Java.
 *
 * Method Signatures (You May Use or Modify):
 *   - `public interface Shape { void draw(); }`
 *   - `public class Circle implements Shape { ... }`
 *   - `public class Rectangle implements Shape { ... }`
 */
public class Task_Polymorphism {
    interface shape {
        void  drow();
        double area();
    }
    public static class shap {

    }

    public static void main(String[] args) {
        // TODO: Implement the instructions to demonstrate polymorphism.

        // Example (pseudo-code):add
        /*
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);     // radius = 5.0
        shapes[1] = new Rectangle(4.0, 3.0);  // width=4.0, height=3.0

        for (Shape shape : shapes) {
            shape.draw();
            // If you added area():
            // System.out.println("Area: " + shape.area());
        }
        */
    }
}
