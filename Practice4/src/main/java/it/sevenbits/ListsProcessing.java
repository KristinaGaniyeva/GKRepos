package it.sevenbits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

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


    public List<Integer> getListSet(final ArrayList<Integer> list, final Set<Integer> set) {
        ArrayList<Integer> listResult = new ArrayList<>();
        for (Integer aList : list) {
            if (set.add(aList)) {
                listResult.add(aList);
            }
        }
        return listResult;
    }
}
