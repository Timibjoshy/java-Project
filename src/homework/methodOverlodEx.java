package homework;

import java.util.Scanner;

/**
 * Created by expert on 7/13/18.
 */
public class methodOverlodEx { //3 ways to overload a method
    /*1 number of parameters eg:add(int,int),add(int,int,int)
    2 data type of parameters eg:add(int,float),add(int,int)
    3 sequence of data type of parameters eg:add(int,float),add(float,int)
    method overloading is an eg oof static ploymorphsm is also known as compile time binding
     */
    static String name;
   static int age;
   static String type;
    public void dis(String name){
        System.out.println(name);
    }
    public void dis(String name,int age){
        System.out.println(name+""+age);
    }
    public void dis(String name,int age,String type) {
        System.out.println(name + "" + age + "" + type);
    }

    public static void main(String[] args) {
        methodOverlodEx m=new methodOverlodEx();
        m.dis("ttt");
        m.dis("ttt",12);
        m.dis("ttt",12,"u");


    }
}
