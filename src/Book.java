// Homework 1.10
// Aleksandar Zubanov
// 2022/08/15


import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final Author author;
    private int year;

    public Book(String bookTitle, Author author, int year) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && bookTitle.equals(book.bookTitle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, year);
    }

    @Override
    public String toString() {
        return "bookTitle: " + bookTitle +
                ", author: " + author +
                ", year= " + year + ".";
    }
}

