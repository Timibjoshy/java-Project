package first;

/**
 * Created by expert on 6/29/18.
 */
public class WrapperclassEx {
    public static void main(String[] args) {
        int a=10;
        Integer i=Integer.valueOf(a);//autoboxing
        float f=10.0f;
        Float f1=Float.valueOf(f);
        String s="1234";
        Integer x=Integer.parseInt(s);
        System.out.println(x);
        System.out.println(f);
        System.out.println(a);
    }
}
