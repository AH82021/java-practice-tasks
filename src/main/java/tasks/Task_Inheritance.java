package tasks;


import org.w3c.dom.ls.LSOutput;

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
public class Task_Inheritance {
    //base class


    public static void main(String[] args) {
        // TODO: Create and test your LibraryItem classes here.

        class LibraryItem {
            //instance
            private String title;
            private String itemId;
            //constructor

            public LibraryItem(String title, String itemId) {
                this.title = title;
                this.itemId = itemId;

            }


            LibraryItem() {

            }

            // geter
            public String getTitle() {
                return title;
            }

            public String getItemId() {
                return itemId;
            }

            public void checkout() {
                return;
            }

            public void returnItem() {
                return;
            }

            //subclass BOOK
            class Book extends LibraryItem {
                private String author;
                private int numPages;

                public Book(String title, String itemId, String author, int numPages) {
                    super( title, itemId );//here we inherit title and itemId from super class
                }

                //getter
                public String getAuthor() {
                    return author;
                }

                public int getNumPages() {
                    return numPages;

                }


            }


            }
            //dvd bass class


        //magazine subclass
        class magazine extends LibraryItem{
            private int issueNumber;
           private String publicationMonth;
           //
            public magazine(String title, String itemId,int issueNumber, String publicationMonth) {
                super(title,itemId);
            }
            //


            public int getIssueNumber() {
                return issueNumber;
            }

            public String getPublicationMonth() {
                return publicationMonth;
            }
            //



        }




            // Example (pseudo-code):



 // Create a Book instance
        Book book = new Book("Effective Java", "B001", "Joshua Bloch", 416);
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
       // book.checkout();
       // book.returnItem();




    // Create a DVD instance
        DVD dvd = new DVD("Inception", "D001", "Christopher Nolan", 148);
        System.out.println("\nDVD Title: " + dvd.getTitle());
        System.out.println("Director: " + dvd.getDirector());
        dvd.checkout();
        dvd.returnItem();

        // Create a Magazine instance
        Magazine magazine = new Magazine("National Geographic", "M001", 202, "July");
        System.out.println("\nMagazine Title: " + magazine.getTitle());
        System.out.println("Issue Number: " + magazine.getIssueNumber());
        magazine.checkout();
        magazine.returnItem();




        }
    }

    /**
     * Base Class: LibraryItem
     */
    class LibraryItem {
        String title;
        int itemId;
        boolean isCheckedOut;

        /**
         * Constructor for LibraryItem
         *
         * @param title  The title of the library item
         * @param itemId The unique identifier for the library item
         */
        public LibraryItem(String title, String itemId) {
            this.title = title;
            this.itemId = Integer.parseInt( itemId );
            this.isCheckedOut = false;
        }

        /**
         * Get the title of the library item
         *
         * @return The title
         */
        public String getTitle() {
            return title;
        }

        /**
         * Get the item ID of the library item
         *
         * @return The item ID
         */
        public int getItemId() {
            return itemId;
        }

        /**
         * Check out the library item
         */
        public void checkout() {
            if (!isCheckedOut) {
                isCheckedOut = true;
                System.out.println( title + " has been checked out." );
            } else {
                System.out.println( title + " is already checked out." );
            }
        }

        /**
         * Return the library item
         */
        public void returnItem() {
            if (isCheckedOut) {
                isCheckedOut = false;
                System.out.println( title + " has been returned." );
            } else {
                System.out.println( title + " was not checked out." );
            }
        }
    }

    /**
     * Derived Class: Book
     */
    class Book extends LibraryItem {
        private String author;
        private int numPages;

        /**
         * Constructor for Book
         *
         * @param title    The title of the book
         * @param itemId   The unique identifier for the book
         * @param author   The author of the book
         * @param numPages The number of pages in the book
         */
        public Book(String title, String itemId, String author, int numPages) {
            super( title, itemId );
            this.author = author;
            this.numPages = numPages;
        }

        /**
         * Get the author of the book
         *
         * @return The author
         */
        public String getAuthor() {
            return author;
        }

        /**
         * Get the number of pages in the book
         *
         * @return The number of pages
         */
        public int getNumPages() {
            return numPages;
        }

        // Optionally override checkout and returnItem if needed
    }

    /**
     * Derived Class: DVD
     */
    class DVD extends LibraryItem {
        private String director;
        private int duration; // duration in minutes

        /**
         * Constructor for DVD
         *
         * @param title    The title of the DVD
         * @param itemId   The unique identifier for the DVD
         * @param director The director of the DVD
         * @param duration The duration of the DVD in minutes
         */
        public DVD(String title, String itemId, String director, int duration) {
            super( title, itemId );
            this.director = director;
            this.duration = duration;
        }

        /**
         * Get the director of the DVD
         *
         * @return The director
         */
        public String getDirector() {
            return director;
        }

        /**
         * Get the duration of the DVD
         *
         * @return The duration in minutes
         */
        public int getDuration() {
            return duration;
        }

        // Optionally override checkout and returnItem if needed
    }

    /**
     * Derived Class: Magazine
     */
    class Magazine extends LibraryItem {
        private int issueNumber;
        private String publicationMonth;

        /**
         * Constructor for Magazine
         *
         * @param title            The title of the magazine
         * @param itemId           The unique identifier for the magazine
         * @param issueNumber      The issue number of the magazine
         * @param publicationMonth The publication month of the magazine
         */
        public Magazine(String title, String itemId, int issueNumber, String publicationMonth) {
            super( title, itemId );
            this.issueNumber = issueNumber;
            this.publicationMonth = publicationMonth;
        }

        /**
         * Get the issue number of the magazine
         *
         * @return The issue number
         */
        public int getIssueNumber() {
            return issueNumber;
        }

        /**
         * Get the publication month of the magazine
         *
         * @return The publication month
         */
        public String getPublicationMonth() {
            return publicationMonth;
        }

        // Optionally override checkout and returnItem if needed
    }

