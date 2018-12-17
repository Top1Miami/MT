package main.classes4gram;

import java.util.ArrayList;

/**
 * Created by Dima on 16.12.2018.
 */
public class Rule {
    ArrayList<String> lit;
    boolean epsilon = false;
    public Rule(ArrayList<String> lit) {
        this.lit = lit;
    }

    public Rule() {
        epsilon = true;
        lit = new ArrayList<>();
        lit.add("EPS");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lit.size() > 1) {
            for (int i = 0; i < lit.size() - 1; i++) {
                sb.append(lit.get(i)).append(" ");
            }
            sb.append(lit.get(lit.size() - 1));
        } else if (!lit.isEmpty()) {
            sb.append(lit.get(0));
        }
        return sb.toString();
    }
}
