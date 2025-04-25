package day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Symmetric Difference Example
public class SymmetricDifference {
    // Intersection Method
    public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
        Set<T> result = new HashSet<>(setA);
        result.retainAll(setB);
        return result;
    }

    // Union Method
    public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
        Set<T> result = new HashSet<>(setA);
        result.addAll(setB);
        return result;
    }

    // Symmetric Difference Method
    public static <T> Set<T> symmetricDifference(Set<T> setA, Set<T> setB) {
        Set<T> union = union(setA, setB);
        Set<T> intersection = intersection(setA, setB);
        union.removeAll(intersection);
        return union;
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> symmetricDiff = symmetricDifference(setA, setB);
        System.out.println("Symmetric Difference: " + symmetricDiff);
    }
}
