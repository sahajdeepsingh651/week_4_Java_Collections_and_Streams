package day2;

import java.util.*;


public class Reverse_list {
    public static void Reverse(List<Integer> listA){
        for(int i = 0 ;i < listA.size() /2 ;i++){
            int last = listA.size() - i - 1 ;
            int temp = listA.get(i);
          listA.set(i, listA.get(last));
          listA.set(last,temp);
        }
    }
    public static void main (String args[]){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(2,3,4,5,6));
       Reverse(list1);
       System.out.println("List1 is reversed:" + list1.toString());
        Reverse(list2);
        System.out.println("List2 is reversed:" + list2.toString());



    }
}
