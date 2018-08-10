package homework;

/**
 * Created by expert on 7/13/18.
 */
public class methodOverr {//used to acheive run tym polymorphism
    //if we dont want a method to be overriden,we declare it as final
    //static methods cannot be overriden
    static String name;
    static int age;
    static String type;
    void show(){//function same as child class
        System.out.println("parent class");
    }
     void  display(){
        System.out.println("total price");
    }

}
