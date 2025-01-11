import java.util.ArrayList;

public class Hideout<T>{
    private T hiddenItem;

    public Hideout() {
        this.hiddenItem = null;
    }

    public void putIntoHideout(T toHide) {
        this.hiddenItem = toHide;
    }

    public T takeFromHideOut() {
        if(this.hiddenItem == null) {
            return null;
        }

        return this.hiddenItem;
    }

    public boolean isInHideOut() {
        return this.hiddenItem != null;
    }




}
