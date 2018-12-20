package main.classes4gram;

import java.util.ArrayList;

/**
 * Created by Dima on 16.12.2018.
 */
public class Rule {
    public ArrayList<Literal> lit;
    boolean epsilon = false;
    public String code;
    public Rule(ArrayList<Literal> lit) {
        this.lit = lit;
    }

    public Rule() {
        epsilon = true;
        lit = new ArrayList<>();
        lit.add(new Literal("EPS", false, null));
    }

    public Rule(String code) {
        this.code = code;
        epsilon = true;
        lit = new ArrayList<>();
        lit.add(new Literal("EPS", false, null));
    }
    public void setCode(String code) {
        this.code = code;
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
