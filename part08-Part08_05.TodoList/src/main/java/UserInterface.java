import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while(true) {
            System.out.println("Command");
            String command = this.scanner.nextLine();


            if(command.equals("stop")){
                break;
            } else if(command.equals("add")) {
                System.out.println("Task?");
                String task = this.scanner.nextLine();

                this.todoList.add(task);
            } else if(command.equals("list")){
               this.todoList.print();
            } else if(command.equals("remove")){
                System.out.println("Id?");
                int id = Integer.valueOf(this.scanner.nextLine());

                this.todoList.remove(id);
            }
            
        }
    }
    
}
