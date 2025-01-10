import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Employees {
    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for(Person person: peopleToAdd) {
            this.employees.add(person);
        }
    }

    public void print() {
       Iterator<Person> iterator = this.employees.iterator();

       while(iterator.hasNext()) {
        System.out.println(iterator.next());
       }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while(iterator.hasNext()) {
            Person person = iterator.next();

            if(person.getEducation().equals(education)) {
                System.out.println(person);
            }
        }
       
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
    
}