package tech.itpark.manager;

import tech.itpark.model.Book;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
   private List<Book> items = new ArrayList<>();
   private int nextId = 1;

   private Book save(Book item) {
       if (item.getId() == 0) {
           item.setId(nextId);
           nextId++;
           items.add(item);
           return item;
       }
       for (Book book : items) {
           if (book.getId() == item.getId()) {
               book.setAuthor(item.getAuthor());
               book.setName(item.getName());
               return book;
           }
       }
       return null;
   }


    private void export() throws IOException {
        Path filePath = Paths.get("books.txt");
        String csq = "";
        // Как получить CSQ для всех объектов?
        Files.writeString(filePath, "");
        return;

    }

}
