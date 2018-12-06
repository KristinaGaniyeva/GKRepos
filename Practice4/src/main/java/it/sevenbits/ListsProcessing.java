package it.sevenbits;

import java.util.*;

public class ListsProcessing {
    public HashMap<Character, Character> getFirstAndLastLetter() {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Zero");
        list.add("Eleven");
        list.add("Second");
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (String aList : list) {
            hashMap.put(aList.charAt(0), aList.charAt(aList.length() - 1));
        }
        return hashMap;
    }

    public List<Set<Integer>> getListSet(final List<Set<Integer>> list, final Set<List> set) {
        List<Set<Integer>> listResult = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!(list.contains(set))) {
                listResult.add(list.get(i));
            }
        }
        return listResult;
    }
}
