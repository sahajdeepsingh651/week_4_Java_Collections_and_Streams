package day2;
import java.util.*;

public class FindSubsets {
    public static <T> boolean isSubset(Set<T> setA, Set<T> setB) {
        return setB.containsAll(setA);
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Is Set A a subset of Set B? " + isSubset(setA, setB));
    }
}
