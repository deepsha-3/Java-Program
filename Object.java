public class Object {
    // Attributes (instance variables)
    private String title;
    private String author;

    // Constructor: initializes the attributes when a new Object object is created
    public Object(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method: displays book details
    public void showDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
    public static void main(String[] args) {
        Object myBook = new Object("1984", "George Orwell");
        myBook.showDetails(); 
    }
}


