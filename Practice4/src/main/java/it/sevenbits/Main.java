package it.sevenbits;

import java.util.*;

/**
 * Main application entry point
 */
public class Main {
    /**
     * Main function for app
     * @param args - console arguments
     */
    public static void main(final String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "zero");
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        ArrayList<Integer> key = new ArrayList<>(hashMap.keySet());
        ArrayList<String> value = new ArrayList<>(hashMap.values());
        System.out.println("Key " + key + "\n" + "Value " + value + "\n");

        ListsProcessing listsProcessing = new ListsProcessing();
        System.out.println("Key - first letter, Value - last letter: " + listsProcessing.getFirstAndLastLetter() + "\n");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(8);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(6);
        set.add(7);
        set.add(2);
        System.out.println("List disjoint elements" + listsProcessing.getListSet(list, set));
    }
}

