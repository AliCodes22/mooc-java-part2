package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> words;
    private String file;

    public SaveableDictionary() {
        this.words = new HashMap<>();
        this.file = null;
    }

    public SaveableDictionary(String file) {
        this.words = new HashMap<>();
        this.file = file;
    }

    public void add(String word, String translation) {
        if (!this.words.containsKey(word)) {
            this.words.put(word, translation);
        }
        if (!this.words.containsKey(translation)) {
            this.words.put(translation, word);
        }
    }

    public String translate(String word) {
        return this.words.getOrDefault(word, null);
    }

    public void delete(String word) {
        if (this.words.containsKey(word)) {
            String translation = this.words.get(word);
            this.words.remove(word);
            this.words.remove(translation);
        }
    }

    public boolean load() {
        if (this.file == null) {
            return false;
        }

        try (Scanner reader = new Scanner(new File(this.file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String word = parts[0].trim();
                    String translation = parts[1].trim();
                    this.words.put(word, translation);
                    this.words.put(translation, word);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        if (this.file == null) {
            return false;
        }

        try (PrintWriter writer = new PrintWriter(new File(this.file))) {
            HashSet<String> savedWords = new HashSet<>();
            for (String word : this.words.keySet()) {
                String translation = this.words.get(word);
                if (!savedWords.contains(word) && !savedWords.contains(translation)) {
                    writer.println(word + ":" + translation);
                    savedWords.add(word);
                    savedWords.add(translation);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
