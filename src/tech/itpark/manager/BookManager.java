package tech.itpark.manager;

import tech.itpark.model.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class BookManager {

    private List<Book> items = new ArrayList<>();
   private int nextId = 1;

   public Book save(Book item) {
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


    public File export() throws IOException {
        File file = new File("Books.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);

        for (Book item : items) {
            fileWriter.write(item.getId() + ";" + item.getAuthor() + ";" + item.getName() + "\n");
        }
        fileWriter.close();
        return file;
    }

    }
