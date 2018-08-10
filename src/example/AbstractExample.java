package example;

/**
 * Created by expert on 6/28/18.
 */
public class AbstractExample extends sample {


    int add(int x, int y) {
        return x + y;
    }

    void display() {
        System.out.println("abstract class function");
    }

    @Override
    String details() {
        System.out.println("hi");
        return "a";
    }

    public static void main(String[] args) {
        AbstractExample e = new AbstractExample();//cannot create object for abstract class,we can create
        //object for implementation class because abstract class do not haave constructor

        e.display();
        sample s=new AbstractExample();//assign
        s.display();
        s.show();
        System.out.println(e.add(2,3));//or e.add(2,3)
        s.details();
    }
}
