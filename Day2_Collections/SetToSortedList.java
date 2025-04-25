package day2;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        //
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));


        List<Integer> sortedList = new ArrayList<>(numberSet);

        Collections.sort(sortedList);

        System.out.println("Sorted List: " + sortedList);
    }
}

