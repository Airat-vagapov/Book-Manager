package tech.itpark;

import tech.itpark.manager.BookManager;
import tech.itpark.model.Book;

import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book one = bookManager.save(new Book(
            0,
            "War and Piece",
            "Lev Tolstoy"
        ));

        Book two = bookManager.save(new Book(
                0,
                "Anna Karenina",
                "Tolstoy"
        ));

        Book three = bookManager.save(new Book(
                0,
                "The Brothers Karamazov",
                "Fyodor Dostoyevsky"
        ));
        try {
            System.out.println(bookManager.export());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
