public class OneItemBox extends Box {
    private Item storedItem;
    

    public OneItemBox() {
         this.storedItem = null;
    }

    public void add(Item item) {
        if(this.storedItem == null) {
            this.storedItem = item;
        }

    }

    @Override
    public boolean isInBox(Item item) {
        // Check if the stored item matches the given item
        return this.storedItem != null && this.storedItem.equals(item);
    }

}
