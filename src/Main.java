// Homework 1.10
// Aleksandar Zubanov
// 2022/08/15


public class Main {
    public static void main(String[] args){
        Author firstAuthor = new Author("Kathy", "Sierra");
        Author secondAuthor = new Author("Bruce", "Eckel");

        Book firstBook = new Book("Head First Java", firstAuthor, 2012);
        Book secondBook = new Book("Thinking in Java", secondAuthor, 2015);

        System.out.println(firstBook);
        System.out.println(secondBook);

        System.out.println(firstBook.equals(secondBook));
        System.out.println(firstBook.hashCode() == secondBook.hashCode());
        System.out.println("firstBook hashCode: " + firstBook.hashCode());
        System.out.println("secondBook hashCode:" + secondBook.hashCode());
    }

}