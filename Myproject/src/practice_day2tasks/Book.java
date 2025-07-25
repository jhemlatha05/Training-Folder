package practice_day2tasks;

public class Book {
    String title;       // Field 1: Book title
    String author;      // Field 2: Author name
    double price;       // Field 3: Book price

    // Method to display the book's details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        // Creating first book object
        Book book1 = new Book();
        book1.title = "Wings of Fire";         // Assigning title
        book1.author = "Dr. A.P.J Abdul Kalam"; // Assigning author
        book1.price = 350;                      // Assigning price

        // Creating second book object
        Book book2 = new Book();
        book2.title = "The Alchemist";
        book2.author = "Paulo Coelho";
        book2.price = 299;

        // Calling display method
        book1.displayDetails();
        System.out.println("-----------------");
        book2.displayDetails();
    }
}



