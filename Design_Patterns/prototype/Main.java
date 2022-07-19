package prototype;

public class Main {
    public static void main(String args[]) throws CloneNotSupportedException{
        BookShop b1= new BookShop();
        b1.setShopName("Sarasavi");
        b1.loadData();
        System.out.println(b1);


//        BookShop b2= (BookShop)b1.Clone();
//        b2.setShopName("Wasana");
//        System.out.println(b2);
    }
}
