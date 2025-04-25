package day2;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
public class UnionandIntersection {
    public static  <A,B> Set<Object> Union( Set<A> setA ,Set<B>setB){
        Set<Object> result = new HashSet<>();
        result.addAll(setA);
        result.addAll(setB);
        return result;
    }
    public static  <A,B> Set<Object> Intersection( Set<A> setA ,Set<B>setB){
        Set<Object> result = new HashSet<>(setA);
  result.retainAll(setB);
        return result;
    }
    public static void main(String args[]){
        Set<Integer> SetA = new HashSet<>(Arrays.asList(2,3));
        Set<Integer> SetB = new HashSet<>(Arrays.asList(1,2,3,4));
        System.out.println("Union is ");
        System.out.println(Union(SetA,SetB));
        System.out.println("Intersection is ");
        System.out.println(Intersection(SetA,SetB));


    }
}
