package homework;

import java.util.Scanner;

/**
 * Created by expert on 7/13/18.
 */
public class overrideEx extends methodOverr{
    @Override
     void show() {
        super.show();
        {
            System.out.println("child class");
        }
    }

    @Override
  void display() {
        super.display();
        System.out.println("total price");
    }

    public static void main(String[] args) {
        methodOverr r=new methodOverr();//object for parent class to print parent class
        overrideEx e=new overrideEx();//obj for child class
        e.show();
        r.show();
        r.display();
        e.display();
        Scanner s = new Scanner(System.in);
        System.out.println("enter name");
        name = s.next();
        System.out.println("enter age & type");
        age = s.nextInt();
        type = s.next();
        System.out.println("name:" + name + "age:" + age + "type:" + type);
    }
}
