package homework;

import java.util.Scanner;

/**
 * Created by expert on 7/13/18.
 */
public class consOverload {
     String name;
      int age;
     String type;

    public consOverload(String name) {
        this.name = name;
        System.out.println("dog name:"+name);
    }

    public consOverload(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("dog name:"+name+"age"+age);
    }

    public consOverload(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public static void main(String[] args) {
        consOverload c=new consOverload("eee")  ;
        consOverload c1=new consOverload("eee",56)  ;
        consOverload c2=new consOverload("eee",56,"hhh")  ;
    }
}
