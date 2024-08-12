import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations{
    private HashMap<String,ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word,String translation) {
        if(!this.translations.containsKey(word)){
            this.translations.put(word, new ArrayList<>());
        }

        this.translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if(this.translations.get(word) == null) {
            return new ArrayList<>();
        }

        return this.translations.get(word);
    }

    public void remove(String word) {
        if(this.translations.get(word) == null) {
        return;
       }
        this.translations.remove(word);
    }

}