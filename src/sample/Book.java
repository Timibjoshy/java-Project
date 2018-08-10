package sample;

/**
 * Created by expert on 7/11/18.
 */
public class Book {
    int price;
    String name;
    String id;
    Author obj;

    public Book(int price, String name, String id, Author obj) {
        this.price = price;
        this.name = name;
        this.id = id;
        this.obj = obj;
    }

    public void display() {
        System.out.println(price);
        System.out.println(name);
        System.out.println(id);
    }
}
