import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> pipes;

    public Pipe() {
        this.pipes = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipes.add(value);
    }

    public T takeFromPipe() {
        if(this.pipes.isEmpty()) {
            return null;
        }

        return this.pipes.get(this.pipes.size() - 1);
    }

    public boolean isInPipe() {
        return this.pipes.isEmpty();
    }
}
