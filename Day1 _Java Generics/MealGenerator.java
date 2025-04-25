package day1;

import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.List;

interface MealPlan {

    public void setName(String name);
    public void getName();

}
class VegetarianMeal implements  MealPlan{
    private String name;
public void  setName(String name){
    this.name = name;
}
public void getName(){
    System.out.println("VegetarianMeal  is "+ name);
}

}
class VeganMeal implements  MealPlan{
    private String name;
    public void  setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("VeganMeal is "+ name);
    }
}
class NonVegetarianMeal implements  MealPlan{
    private String name;
    public void  setName(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("NonVegetarianMeal  is "+ name);
    }

}
class Meal<T extends MealPlan>{
    private List<T> Mealarray = new ArrayList<>();
    public void addMeal(T meal){
        Mealarray.add(meal);
    }
    public List<T> getMealarray(){
        return Mealarray;
    }
}
class MealUtils{
    public static void IterateList(List<? extends MealPlan> mealList){
        for (MealPlan meal : mealList){
            meal.getName();
        }
    }
}
public class MealGenerator {
    public static void main(String args[]){
        VegetarianMeal M1 = new VegetarianMeal();
        M1.setName("Aloo");
        M1.getName();
        NonVegetarianMeal M2 = new NonVegetarianMeal();
        M2.setName("Chicken");
        M2.getName();
        VeganMeal M3 = new VeganMeal();
        M3.setName("Milk");
        M3.getName();
Meal<VegetarianMeal> VegetarianList = new Meal<>();
VegetarianList.addMeal(M1);
VegetarianList.getMealarray();

Meal<NonVegetarianMeal> NonVegetarianList = new Meal<>();
NonVegetarianList.addMeal(M2);
NonVegetarianList.getMealarray();

Meal<VeganMeal>VeganList = new Meal<>();
        VeganList.addMeal(M3);

        VeganList.getMealarray();

 MealUtils.IterateList(VegetarianList.getMealarray());
    }
}
