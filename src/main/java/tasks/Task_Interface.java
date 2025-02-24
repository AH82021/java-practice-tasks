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
public class Drinkable {

    public void Drink();
    public void filter();
}
    public class water implements Drinkable {
      String bottle;
      String filter;
    }
@override;
 public void Drink(){
     System.out.println(""water is drunked" +"by me");
 }
    
public void filter(){
        System.out.println("One bottle water is being filtering");
    
}
 public class juice implements Drinkable{
     @override;
 public void Drink(){
   System.out.println("i am drinking a" +"bottle of"+"juice. ")
       }
    public void filter(){
        System.out.println("the juice is filtered.")
} 
     public static void main(String[] args) {
         Drinkable Drinkable1 = new Drinkable();
         Drinkable Drinkable2 = new Drinkable();
         Drinkable1.Drink();
         Drinkable1.filter();
         Drinkable2.Drink();
         Drinkable2.filter();
     }
