package design_patterns.decorator;

import java.util.ArrayList;

public class Character {
    private String name;
    protected ArrayList<String> lines;

    public Character(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n");
        for(String line : line) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }


}