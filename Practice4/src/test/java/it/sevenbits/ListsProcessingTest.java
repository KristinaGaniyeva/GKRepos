package it.sevenbits;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class ListsProcessingTest {

    @Test
    public void getListSet() {
        ListsProcessing listsProcessing = new ListsProcessing();

        //Expected
        Set<Integer> setTest = new HashSet<>();
        setTest.add(1);
        setTest.add(2);
        setTest.add(3);

        ArrayList<Set<Integer>> listTest = new ArrayList<>();
        listTest.add(setTest);



       // List set
        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(4);
        firstSet.add(5);
        firstSet.add(6);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(1);
        secondSet.add(2);
        secondSet.add(3);

        List<Set<Integer>> listR = new ArrayList<>();
        listR.add(firstSet);
        listR.add(secondSet);


        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(6);

        assertEquals(listTest, listsProcessing.getListSet(listR, set));
    }
}