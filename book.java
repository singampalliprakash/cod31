class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Price=$" + price +
                '}';
    }
}

public class BookExample {
    public static void main(String[] args) {
        Book myBook = new Book("Harry Potter", "J.K. Rowling", 29.99);

        System.out.println(myBook);

        myBook.setPrice(24.99);
        myBook.setTitle("Harry Potter and the Sorcerer's Stone");

        System.out.println("Updated Book: " + myBook);
    }
}
