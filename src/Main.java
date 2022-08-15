// Homework 1.10
// Aleksandar Zubanov
// 2022/08/15


public class Main {
    public static void main(String[] args){
        Author firstAuthor = new Author("Kathy", "Sierra");
        Author secondAuthor = new Author("Bruce", "Eckel");

        Book firstBook = new Book("Head First Java", firstAuthor, 2012);
        Book secondBook = new Book("Thinking in Java", secondAuthor, 2015);

        System.out.println("Author : " + firstAuthor.getFullName() + " book: " + firstBook.getBookName() + " " +
                firstBook.getYear() + " year.");
        System.out.println("Author : " + secondAuthor.getFullName() + " book: " + secondBook.getBookName() + " " +
                secondBook.getYear() + " year.");
    }

}