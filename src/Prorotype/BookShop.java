package Prorotype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    List<Book> books=new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {

        //In this clone you are not fetching data
        // from database but you are fetching data from 1st object
      BookShop shop=new BookShop();
      for(Book b: getBooks())
      {
          shop.getBooks().add(b);
      }

      return  shop;
    }

    public void loadData()
    {
        for(int i=0;i<=10;i++){
            Book b=new Book();
            b.setBid(i);
            b.setBname("Book "+i);
            getBooks().add(b);
        }
    }    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
