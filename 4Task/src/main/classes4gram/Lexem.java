package main.classes4gram;

/**
 * Created by Dima on 17.12.2018.
 */
public class Lexem {
    public String name, regexp;
    public Lexem(String name, String regexp) {
        this.name = name;
        this.regexp = regexp.substring(1, regexp.length() - 1);
    }
    public String getPattern() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        for(int i = 0; i < regexp.length();i++) {
            switch (regexp.charAt(i)) {
                case '*':
                case '(':
                case ')':
                case '?':
                case '+':
                case '|':
                    sb.append("\\\\");
            }
            sb.append(regexp.charAt(i));
        }
        sb.append("\"");
        return sb.toString();
    }
    @Override
    public String toString() {
        return name;
    }
}
