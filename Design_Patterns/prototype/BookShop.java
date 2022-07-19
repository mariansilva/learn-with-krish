package prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

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

    private String shopName;
    List<Book> books = new ArrayList<>();

    public void loadData(){
        for(int i=1;i<=5;i++){
            Book book = new Book();
            book.setBookId(i);
            book.setBookName("Book" + i);
            getBooks().add(book);
        }

    }
    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

}
