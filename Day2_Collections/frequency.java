package day2;

import jdk.jfr.Frequency;

import java.util.HashMap;
import java.util.*;



public class frequency {
    public static Map<String,Integer>  Frequency(List<String> list){
        Map<String,Integer> frequencyMap = new HashMap<>();
        for(String item : list){
            frequencyMap.put(item, frequencyMap.getOrDefault(item,0)+ 1);
        }
        return frequencyMap;
    }
    public static void main(String args[]){

        List<String> list1 = new ArrayList<>(Arrays.asList("apple","banana","apple","orange"));
        System.out.print(Frequency(list1));

    }
}
