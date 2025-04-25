package day2;
import java.util.*;
public class Setequal {
    public static <T>void SetEqual(Set<T> setA, Set<T> setB){
        if(setA.equals(setB)){
            System.out.println("SetA and SetB are Equal ");
        }
        System.out.println("SetA and SetB are not Equal ");

    }
    public static void main(String args[]){
        Set<Integer> setA = new HashSet<Integer>(Arrays.asList(1,2,4,5,8));
        Set<Integer> setB = new HashSet<Integer>(Arrays.asList(1,2,3,3));
       SetEqual(setA,setB);

    }
}
