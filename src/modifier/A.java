package modifier;

/**
 * Created by expert on 6/21/18.
 */
public class A {
    static int a=1;
    int j=1;
    A(){
        ++a;
        ++j;
        System.out.println("static");//second executed
    }
    static{//while declaring static block,it is first executed
        System.out.println("static block");
    }

    public static void main(String[] args) {
        A obj=new A();
        A obj1=new A();
        A obj2=new A();
        System.out.println(a);
        System.out.println(obj1.j);//non static member ne epazum object veche call cheyan pattu
        // evide j nu parayunnadhu non satic member aanu
    }

}
