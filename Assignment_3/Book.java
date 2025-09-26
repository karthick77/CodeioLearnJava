package Assignment_3;

public class Book {

    private String title;
    private String author;
    private float price;

    //Default Constructor
    public Book() {
        this.title = "New Book";
        this.author = "Myself";
        this.price = 0.0f;
    }

    //Parametrized Constructor
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String displayBookDetails(){
        return ("Title: "+title+" Author: "+author+" Price: "+price);
    }

    public static void main(String[] args) {

        Book book1 = new Book();
        System.out.println(book1.displayBookDetails());
        Book book2 = new Book("JP1","Micheal",177.55f);
        System.out.println(book2.displayBookDetails());
        Book book3 = new Book("HP1","Rowling",217.55f);
        System.out.println(book3.displayBookDetails());
    }
}
