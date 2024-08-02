import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
       for(int i = 0; i < this.todoList.size(); i++) {

        System.out.println((i + 1) + ": " + this.todoList.get(i));
       }
    }

    public int getListSize() {
        return this.todoList.size();
    }

    public void remove(int number) {
        int indexToRemove = number - 1;

        this.todoList.remove(indexToRemove);
    }
}