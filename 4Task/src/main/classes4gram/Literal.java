package main.classes4gram;

import java.util.ArrayList;

/**
 * Created by Dima on 19.12.2018.
 */
public class Literal {
    public String name;
    public boolean nonTerm;
    public ArrayList<String> params;
    public Literal(String name, boolean nonTerm, ArrayList<String> params) {
        this.name = name;
        this.nonTerm = nonTerm;
        this.params = params;
    }
    public Literal(String name, boolean nonTerm) {
        this.name = name;
        this.nonTerm = nonTerm;
    }
}
