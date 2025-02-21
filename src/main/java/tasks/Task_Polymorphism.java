package tasks;



/**
 * Ts)ask: Polymorphism (Practical Example)
 *
 * Title: "Shape Interface and Subclasses"
 *
 * Goal:
 *   - Practice polymorphism by defining an interface with a common method and creating
 *     multiple subclasses that implement it differently.
 *ow each object executes its own version of `draw()` even though
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
 * Guidance:
 *   1. **Create an interface `Shape`** with at least one method, for example:
 *       - `void draw();`
 *       - (Optional) `double area();` to calculate area.
 *
 *   2. **Create two or more classes** that implement `Shape`, such as:
 *       - `Circle` (with a `radius` field)
 *       - `Rectangle` (with `width` and `height` field
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
 *         - Observe h
 */
public interface drawabl{ 
public void draw(); 
    public int area();
}

public class Shape implements drawabl {
}
public int radius;
public int width;
public int hight;
public void draw ();
{
System.out.println("Drawing a shape");
}
public class Circle extends Shape {
public void draw() ;{
    
System.out.println("Drawing a Circle"+radius);
}
public class Rectangle extends Shape {
public int area() {
System. out println("Drawing a Rectangle"+width+hight);
} 
}
public static void main(String[] args) {
}
Shape Shape1 = new Shape("int radius", 23);
Shape Shape2 = new Shape("int width", 34, "int hight", 45);
drawable drawblel = drawblel;
drawble drawble2 = drawble2;
drawble1. void draw();  
drawbLe1. int area();
drawble2. void draw(); 
drawble2. int area();
}
