import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        // Test your method here with a valid file path
        String filePath = "books.txt";
        List<Book> books = readBooks(filePath);
        books.forEach(System.out::println); // Print books for testing
    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();

        try {
            books = Files.lines(Paths.get(file))
                .map(row -> row.split(","))
                .filter(parts -> parts.length == 4) // Ensure valid format
                .map(book -> new Book(
                        book[0].trim(), 
                        Integer.parseInt(book[1].trim()), 
                        Integer.parseInt(book[2].trim()), 
                        book[3].trim())).collect(Collectors.toList());

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }

        return books;
    }
}

