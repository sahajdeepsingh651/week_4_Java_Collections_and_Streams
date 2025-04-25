package day2;
import java.util.*;
class Rotate<T>{
    public  List<T> RotateList(List<T> list1,int rotate){
       ArrayList<T> Arrlist = new ArrayList<>();
       for(int i = rotate ;i < list1.size() ;i++){
           Arrlist.add(list1.get(i));
       }//this will add non rotating elements first
       for(int i = 0 ; i < rotate;i++){
           Arrlist.add(list1.get(i));
       }
       return Arrlist;
    }
}

public class RotateList {
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Rotate<Integer> r = new Rotate<>();
       List <Integer> B =  r.RotateList(arr,2);
       System.out.println(B.toString());

    }

}
