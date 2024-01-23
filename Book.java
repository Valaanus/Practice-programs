package org.example.practice;
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public static void main(String[] args) {
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        System.out.println("Title: " + myBook.getTitle());
        System.out.println("Author: " + myBook.getAuthor());
        System.out.println("Publication Year: " + myBook.getPublicationYear());
        myBook.setTitle("To Kill a Mockingbird");
        myBook.setAuthor("Harper Lee");
        myBook.setPublicationYear(1960);
        System.out.println("Updated Title: " + myBook.getTitle());
        System.out.println("Updated Author: " + myBook.getAuthor());
        System.out.println("Updated Publication Year: " + myBook.getPublicationYear());
    }
}
