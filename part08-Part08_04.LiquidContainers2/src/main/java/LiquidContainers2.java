import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        System.out.println("First: " + container1.toString());
        System.out.println("Second: " + container2.toString());

        while (true) {
            String input = scanner.nextLine();

            // Split the input into command and number
            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("quit")) {
                break; // Exit the loop
            }

            int num = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(num);
            }

            if (command.equals("remove")) {
                container2.remove(num);
            }

            if (command.equals("move")) {
                // Move liquid from container1 to container2
                int amountToMove = Math.min(num, container1.contains());
                container1.remove(amountToMove);
                container2.add(amountToMove);
            }

            // Display the updated state of the containers
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());
        }

        scanner.close(); // Close the scanner
    }
}
