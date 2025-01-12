
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random generateRandom = new Random();
        

       

        while(this.numbers.size() < 7) {
            int randomNumber = generateRandom.nextInt(40) + 1;
            if(!this.containsNumber(randomNumber)){
                this.numbers.add(randomNumber);
            }
        }

        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if(this.numbers.contains(number)) {
            return true;
        }

        return false;
    }
}

