package example;

/**
 * Created by expert on 6/28/18.
 */
public abstract class sample {//in abstract class we can declare abstract & non abstract methods

    abstract int add(int x,int y);
    abstract void display();

    abstract  String details();

    public void show(){
        System.out.println("Hello world");//in this class only methods are declared in order
        //to provide implementation create another class abstractEx

    }

}
