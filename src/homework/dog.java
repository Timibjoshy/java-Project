package homework;

import java.util.Scanner;

/**
 * Created by expert on 7/13/18.
 */
public class dog {


    static String name;
    static int age;
    static String type;

    public dog() {
        System.out.println("dog details");
    }

   /* public dog(String name,int age,String type)
    {
    this.name=name;
    this.age=age;
    this.type=type;

    } */


    public static void main(String[] args) {
       //for default no need for parametrized
         dog d = new dog();//default constructor invoke when object is created
        //if we use parametrized constructor no need to create object
        Scanner s = new Scanner(System.in);
        System.out.println("enter name");
        name = s.next();
        System.out.println("enter age & type");
        age = s.nextInt();
        type = s.next();
        System.out.println("name:" + name + "age:" + age + "type:" + type);


}
}
