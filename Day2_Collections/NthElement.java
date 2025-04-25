package day2;
import java.util.LinkedList;
import java.util.Iterator;

public class NthElement{

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();
        //so the logic is we want the second pointer to move
        //size - first pointer distance
        //so first pointer is used to find that distance
        //first pointer move n distance  leaving size - n distance to move
        //so second and first pointer move at the same time
        //which result in second pointer moving size - n distance which is
        //the nth distance from the end

        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) return null;  // n > size
            first.next();
        }


        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.hasNext() ? second.next() : null;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        String result = findNthFromEnd(list, 2);  // Should return "D"
        System.out.println("Nth element from the end: " + result);
    }
}
