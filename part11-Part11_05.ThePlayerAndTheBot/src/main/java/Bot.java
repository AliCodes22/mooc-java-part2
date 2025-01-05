import java.util.ArrayList;

public class Bot extends Player {

    public Bot() {
        super("Bot");
       
    }

    public void play(){
        System.out.println("Bot move");
    }

    public void addMove(String move) {
        System.out.println("Adding..." + move);
    }

}