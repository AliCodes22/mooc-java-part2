
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Stream;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        
        ArrayList<Integer> nums = new ArrayList<>();

        while(true) {
            String value = scanner.nextLine();

            if(value.equals("end")) {
                break;
            }
            int numValue = Integer.valueOf(value);
            nums.add(numValue);

        }

        OptionalDouble average = nums.stream().mapToInt(Integer::intValue).average();

        System.out.println("average of the numbers: " + average);
    }
}
