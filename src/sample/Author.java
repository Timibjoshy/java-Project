package sample;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by expert on 7/11/18.
 */
public class Author {
    int age;
    String name;
    int number;

    public Author(int age, String name, int number) {
        this.age =age;
        this.name = name;
        this.number = number;
       this.age=age;
    }
    public void display() {
        System.out.println(age);
        System.out.println(name);
        System.out.println(number);
    }
}
