package pack;

/**
 * Created by expert on 6/22/18.
 */
public class method {
   static int i=10;
    public static void display(){
        int x,y; //variables declared inside the static method is always static
        System.out.println("Hello"+i);//in this case i is not executed error occured
    }               //declaring static int it is executed

    public static void main(String[] args) {
        {
            method.display();//also declared as display();

        }
    }
}
