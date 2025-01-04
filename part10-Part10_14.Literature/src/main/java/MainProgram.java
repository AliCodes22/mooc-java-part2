
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while(true) {
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();

            if(input.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());

            Book book = new Book(input, age);
            books.add(book);
        }

        System.out.println(books.size() + " books in total.");

        System.out.println("Books:");
       
        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecommendation).thenComparing(Book::getName);

        Collections.sort(books,comparator);

        for(Book book: books) {
            System.out.println(book);
        }

    }

}
