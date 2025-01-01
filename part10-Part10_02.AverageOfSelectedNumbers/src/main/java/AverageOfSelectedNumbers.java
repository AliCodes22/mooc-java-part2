
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        ArrayList<Integer> nums = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("end")) {
                break;
            }

            int num = Integer.valueOf(input);
            nums.add(num);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers?" + "\n" + "(n/p)");
        String answer = scanner.nextLine();

        if(answer.equals("n")) {
            OptionalDouble negativeNumbersAverage = nums.stream().mapToInt(Integer::intValue).filter(num -> num < 0).average();

            if(negativeNumbersAverage.isPresent()) {
                System.out.println("Average of the negative numbers: " + negativeNumbersAverage);
            } else {
                System.out.println("No negative numbers provided.");

            }
        } else if(answer.equals("p")) {
            OptionalDouble positiveNumbersAverage = nums.stream().mapToInt(Integer::intValue).filter(num -> num > 0).average();

            if(positiveNumbersAverage.isPresent()) {
                System.out.println("Average of the positive numbers: " + positiveNumbersAverage);
            } else {
                System.out.println("No positive numbers provided.");

            }
        }

    }
}
