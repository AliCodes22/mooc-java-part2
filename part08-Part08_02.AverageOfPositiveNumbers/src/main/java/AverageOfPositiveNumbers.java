
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int length = 0;
       


        while(true) {
            int input = Integer.valueOf(scanner.nextLine());

            if(input == 0) {
                break;
            }
            if(input > 0) {
                sum+= input;
                length++;
            }
            
        }

        if(length == 0) {
            System.out.println("Cannot calculate the average");
        }

        if(length > 0) {
            System.out.println((double)sum / length);
        }

        
    }
}
