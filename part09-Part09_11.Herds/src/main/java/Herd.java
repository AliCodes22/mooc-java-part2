import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> objects;

    public Herd() {
        this.objects = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.objects.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable movable: this.objects) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String herd = "";
        for(Movable movable: this.objects) {
            herd += movable.toString() + "\n";
        }

        return herd;
    }

    



    
}
