package Prorotype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs=new BookShop();
        bs.setShopName("Comdey");
        bs.loadData();
        BookShop bs2=  bs.clone();
        //By this without loading book data you are getting every books
        bs2.setShopName("Romance");
        bs2.getBooks().remove(2);
        System.out.println(bs);
        System.out.println(bs2);
    }
}
