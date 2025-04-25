package day2;

import java.util.*;

public class RemoveDuplicates {
    public static <T>List<T> remove(List<T> list){
        ArrayList<T> newlist = new ArrayList<>();
        for(int i = 0 ; i <=list.size() -2 ;i++){
            if(!list.get(i).equals(list.get(i+1)) ){
                newlist.add(list.get(i));
                if(i == list.size() -2 ){
                    newlist.add(list.get(i+1));
                }
            }

        }
        return newlist;
    }
    public static void main(String args[]){
        List<Integer> ListA = new ArrayList<>(Arrays.asList(1,2,2,4,5,5,6));
        List<Integer>listB = remove(ListA);
        System.out.println(listB.toString());
    }


}
