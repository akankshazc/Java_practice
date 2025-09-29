package hf_11;

import java.util.*;

public class SortMountains {
    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("ELbert", 14433));
        mountains.add(new Mountain("Maroon", 14126));
        mountains.add(new Mountain("Castle", 14265));

        System.out.println("as entered:\n" + mountains);

        mountains.sort((one, two) -> one.getName().compareTo(two.getName()));
        System.out.println("by name:\n" + mountains);

        mountains.sort((one, two) -> two.getHeight() - one.getHeight());
        System.out.println("by height:\n" + mountains);
    }
}

class Mountain {
    private String name;
    private int height;

    Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    public String toString() {
        return name + " " + height;
    }
}