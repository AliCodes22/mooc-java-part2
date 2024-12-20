public class Container {

    private int totalLiquid;

    public Container() {
        this.totalLiquid = 0;

    }

    public int contains() {
        return this.totalLiquid;
    }

    public void add(int amount) {
        if(amount > 0 && this.totalLiquid + amount < 100) {
            this.totalLiquid += amount;
           
        } else {
            return;
        }
    }

    public void remove(int amount){

    }

    
}
