package sample;

/**
 * Created by expert on 7/17/18.
 */
 class Thread1 extends Thread {
    Thread1(Thread1Ex obj)
    {
        this.obj = obj;
    }

    Thread1Ex obj;

    public void run() {
        obj.display(100);
    }

}
class Thread2 extends Thread {
    Thread2(Thread1Ex obj) {
        this.obj = obj;
    }

    Thread1Ex obj;

    public void run() {
        obj.display(5);

    }

}
public  class Threadain{


    public static void main(String[] args) {
        Thread1Ex obj=new Thread1Ex();
        Thread1Ex obj1=new Thread1Ex();//object created for main class
        Thread1 t=new Thread1(obj);
        Thread2 t1=new Thread2(obj);
        Thread2 t2=new Thread2(obj);
        Thread2 t3=new Thread2(obj1);
        Thread2 t4=new Thread2(obj1);
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
