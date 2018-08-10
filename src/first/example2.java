package first;
import pack.method;
//or import pack.*;
/**
 * Created by expert on 6/22/18.
 */
public class example2 {
    static int i;
    static class staticEx{
      static void disp(){
          System.out.println("static method");
      }
      public void getfun(){
          System.out.println("non static method");
      }
    }
    public static void main(String[] args) {
        method.display();//display anothor class in another packages
        example2.staticEx.disp();//example class le static method ne call cheyan
        example2.staticEx obj=new example2.staticEx();//object created for non static method
        obj.getfun();//call non static using created object
    }


}
