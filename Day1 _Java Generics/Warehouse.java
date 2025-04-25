package day1;
import java.nio.file.WatchEvent;
import java.util.*;
abstract class WarehouseItem{
private String name;
public WarehouseItem(String name){
     this.name = name;

}
public String getName(){
     return name;
}
public abstract void display();
}
class Electronics extends WarehouseItem {
     public Electronics(String name){
          super(name);
     }

     @Override
     public void display(){
          System.out.println("Electronics Item: "+ getName());
     }
}
class Furniture extends WarehouseItem {
     public Furniture(String name){
          super(name);
     }

     @Override
     public void display(){
          System.out.println("Furnitures Item: "+ getName());
     }
}
class Groceries extends WarehouseItem {
     public Groceries(String name){
          super(name);
     }

     @Override
     public void display(){
          System.out.println("Groceries Item: "+ getName());
     }
}
class Storage<T extends  WarehouseItem>{
     List<T> items = new ArrayList<T>();
   public List<T> getItem(){
        return items;
   }
   public void addItem(T item){
        items.add(item);
   }

}
class DisplayAllItems{
     public static void  displayitems(List <? extends WarehouseItem >items){
          for( WarehouseItem item : items){
               item.display();
          }
     }
}
public class Warehouse{
     public static void main(String args[]){
          Storage<Electronics> electronicsStorage= new Storage<>();
          electronicsStorage.addItem(new Electronics("Laptop"));
          electronicsStorage.addItem(new Electronics("SmartPhone"));
          Storage<Groceries> groceriesStorage = new Storage<>();
          groceriesStorage.addItem(new Groceries("Apples"));
          groceriesStorage.addItem(new Groceries("Milk"));

          Storage<Furniture> furnitureStorage = new Storage<>();
          furnitureStorage.addItem(new Furniture("Chair"));
          furnitureStorage.addItem(new Furniture("Table"));
          System.out.println("=== Electronics ===");
          DisplayAllItems.displayitems(electronicsStorage.getItem());
          System.out.println("=== Groceries ===");
          DisplayAllItems.displayitems(groceriesStorage.getItem());
          System.out.println("=== Furniture ===");
          DisplayAllItems.displayitems(furnitureStorage.getItem());

     }
}