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
        System.out.println("Key: " + key + "\n" + "Value: " + value + "\n");

        ListsProcessing listsProcessing = new ListsProcessing();
        System.out.println("Key - first letter, Value - last letter: " + listsProcessing.getFirstAndLastLetter() + "\n");

        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(4);
        secondSet.add(5);
        secondSet.add(6);

        Set<Integer> thirdSet = new HashSet<>();
        thirdSet.add(7);
        thirdSet.add(8);
        thirdSet.add(9);

        List<Set<Integer>> list = new ArrayList<>();
        list.add(firstSet);
        list.add(secondSet);
        list.add(thirdSet);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("List disjoint elements: " + listsProcessing.getListSet(list, set));
    }
}

