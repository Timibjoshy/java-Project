package pack;
import pack.myC;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by expert on 8/8/18.
 */
public class Reflection {
    public static void main(String[] args) {
        Class m=myC.class;
        Field[]fields=m.getDeclaredFields();
        for (Field f:fields){
            System.out.println(f.getName());
        }
        System.out.println("methods");
        Method[]marray=m.getMethods();
        for (Method mt:marray){
            System.out.println(mt.getName());
        }
    }

}
