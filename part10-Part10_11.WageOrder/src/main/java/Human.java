
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    // sort in descending order
    @Override
    public int compareTo(Human human)  {
        // if this wage is bigger than next one, it stays, therefore return -1
        if(this.getWage() > human.getWage()) {
            return -1;
        
        } // if this wage is smaller, swap it by returning 1
            else if(this.getWage() < human.getWage()) {
            return 1;
        } else {
            return 0;
        }
    }
}
