import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        // create new entry if it doesn't exist
       this.translations.putIfAbsent(word, new ArrayList<String>());

       // now add the translation to the provided word
       this.translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {

        // get values associated to the word
        ArrayList<String> values = this.translations.get(word);

        // before returning it, check whether they're null or not, or
        // if the word has no translations
        if(values == null) {
            return new ArrayList<>();
        }

        return values;
    }

    public void remove(String word) {
        this.translations.remove(word);
    }

    
}
