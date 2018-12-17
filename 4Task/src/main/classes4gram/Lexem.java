package main.classes4gram;

/**
 * Created by Dima on 17.12.2018.
 */
public class Lexem {
    String name, regexp;
    public Lexem(String name, String regexp) {
        this.name = name;
        this.regexp = regexp.substring(1, regexp.length() - 1);
    }
    @Override
    public String toString() {
        return name;
    }
}
