package sample;

/**
 * Created by expert on 7/18/18.
 */
public class garbageC {

protected void finalize()throws Throwable{
    System.out.println("garbage collection");
}
    public static void main(String[] args) {
        garbageC obj=new garbageC();
        garbageC obj2=new garbageC();
        obj=null;
        obj2=null;
        System.gc();

    }
}
