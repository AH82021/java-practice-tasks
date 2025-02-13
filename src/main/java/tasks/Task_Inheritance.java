package tasks;


/**
 * Task: Inheritance (Practical Example)
 *
 * Title: "Library Management System"
 *
 * Goal:
 *   - Practice inheritance by creating a base class and derived classes that represent different types
 *     of library items.
 *
 * Guidance:
 *   1. **Create a Base Class `LibraryItem`**:
 *       - **Fields**:
 *         - `private String title;`
 *         - `private String itemId;`
 *       - **Constructor**:
 *         - Initialize `title` and `itemId`.
 *       - **Methods**:
 *         - `public String getTitle()`
 *         - `public String getItemId()`
 *         - `public void checkout()`
 *         - `public void returnItem()`
 *
 *   2. **Create Derived Classes** that extend `LibraryItem`:
 *       - **`Book` Class**:
 *         - **Additional Fields**:
 *           - `private String author;`
 *           - `private int numPages;`
 *         - **Constructor**:
 *           - Initialize all fields, including those from `LibraryItem`.
 *         - **Methods**:
 *           - `public String getAuthor()`
 *           - `public int getNumPages()`
 *           - Override `checkout()` and `returnItem()` if needed.
 *
 *       - **`DVD` Class**:
 *         - **Additional Fields**:
 *           - `private String director;`
 *           - `private int duration;` // duration in minutes
 *         - **Constructor**:
 *           - Initialize all fields, including those from `LibraryItem`.
 *         - **Methods**:
 *           - `public String getDirector()`
 *           - `public int getDuration()`
 *           - Override `checkout()` and `returnItem()` if needed.
 *
 *       - **`Magazine` Class**:
 *         - **Additional Fields**:
 *           - `private int issueNumber;`
 *           - `private String publicationMonth;`
 *         - **Constructor**:
 *           - Initialize all fields, including those from `LibraryItem`.
 *         - **Methods**:
 *           - `public int getIssueNumber()`
 *           - `public String getPublicationMonth()`
 *           - Override `checkout()` and `returnItem()` if needed.
 *
 *   3. **Demonstrate Inheritance in the `main` Method**:
 *       - Create instances of `Book`, `DVD`, and `Magazine`.
 *       - Display their details using the getter methods.
 *       - Call `checkout()` and `returnItem()` methods to simulate borrowing and returning items.
 *
 *   4. **Optional Enhancements**:
 *       - Add more derived classes, such as `ReferenceBook` that cannot be checked out.
 *       - Implement additional methods or fields as needed.
 *
 * Note for New Java Students:
 *   - **Inheritance** allows you to create a new class that reuses, extends, and modifies the behavior
 *     defined in another class.
 *   - The `LibraryItem` class serves as a **parent** or **base** class, providing common attributes
 *     and methods for all library items.
 *   - The `Book`, `DVD`, and `Magazine` classes are **child** or **derived** classes that inherit
 *     from `LibraryItem` and add their own specific attributes and behaviors.
 *   - Use the `super` keyword to call the constructor of the base class when initializing derived
 *     class objects.
 *
 * Method Signatures (You May Use or Modify):
 *   - **LibraryItem Class**:
 *     - `public LibraryItem(String title, String itemId)`
 *     - `public String getTitle()`
 *     - `public String getItemId()`
 *     - `public void checkout()`
 *     - `public void returnItem()`
 *
 *   - **Book Class**:
 *     - `public Book(String title, String itemId, String author, int numPages)`
 *     - `public String getAuthor()`
 *     - `public int getNumPages()`
 *
 *   - **DVD Class**:
 *     - `public DVD(String title, String itemId, String director, int duration)`
 *     - `public String getDirector()`
 *     - `public int getDuration()`
 *
 *   - **Magazine Class**:
 *     - `public Magazine(String title, String itemId, int issueNumber, String publicationMonth)`
 *     - `public int getIssueNumber()`
 *     - `public String getPublicationMonth()`
 *
 * No solution is provided here; you must implement the logic as an exercise.
 */
public class libarysystem {
private String Title;
private int item;
private String author;
private void getTitle(){
    return;}
    private String Title() {
    this.Title=Title;
        {
            this.author = author;
            this.item = item;
            public String borrowiteam () {
            
             if (true) {
                System.out.println("the book is borrowed by me"); 
               } else () {

                System.out.println("No i bought this book from my salary");
            }
            class Book extends libarysystem {
                public void displayinformation() {
                }
            }
            @Override ;
            class DVD extends libarysystem {
                public void turnonDVD() {
                }
                @Override;

                public static void main(String[] args) {
                    libarysystem Libarysystem2 = new libarysystem();
                    String title = "Animal";
                    int item = 6690;
                    String authour = "Andisha";

                    Book Book1 = new Book();
                    {
                        public Void displayinformation () {
                            
                        }
                        DVD DVD4 = new DVD();
                        public void turnonDVD () {
                    }
                    }
                }
            }
        }
                            


