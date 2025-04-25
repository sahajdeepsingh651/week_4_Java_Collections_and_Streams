//package day1;
// class Product{
//     int price;
//     String Category;
//     Product(int price,String Category){
//         this.price = price;
//         this.Category = Category;
//     }
//     public int getPrice(){
//         return this.price;
//     }
//     public String getCategory(){
//         return this.Category;
//     }
//}
//class BookCategory extends Product {
//public BookCategory(int price,String Category){
//    super(price,Category);
//}
//}
//class ClothingCategory extends Product{
//    public ClothingCategory(int price,String Category){
//        super(price,Category);
//    }
//}
//class GadgetCategory extends Product{
//    public GadgetCategory(int price,String Category){
//        super(price,Category);
//    }
//
//}
//class ApplyDiscount<T extends Product>{
//    public  void applyDiscount(T product ,double percentage){
//        System.out.println("Final Price of "+ product.getCategory()+ "is "+  product.getPrice() * ( 1 - percentage/100 ) );
//    }
//}
//public class MarketPlace {
//     public static void main(String args[]){
//         Product productb1 = new BookCategory(100,"BOOK");
//         Product productb2= new BookCategory(150,"BOOK");
//
//         Product productc1 = new ClothingCategory(200,"Cloth");
//         Product productc2 = new ClothingCategory(400,"CLOTH");
//
//
//         Product productg1= new GadgetCategory(300,"Gadget");
//         Product productg2 = new GadgetCategory(300,"Gadget");
//         ApplyDiscount discount = new ApplyDiscount<>();
//         discount.applyDiscount(productb2,100);
//     }
//
//}
class Product<T >{

}


