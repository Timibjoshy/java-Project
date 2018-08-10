package sample;

/**
 * Created by expert on 7/17/18.
 */
//public class ThreadE extends Thread
    public class ThreadE implements Runnable{//impement cheyumbo main function l runnable te oru object create cheyanam.
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
           /* try {
                Thread.sleep(100);//used to sleep after print this function is used in try catch block
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println("************");

    }

    public static void main(String[] args) {
        ThreadE obj=new ThreadE(); //object created
        Thread t1=new Thread(obj);
        t1.start();
        Thread t=new Thread(obj);//created object passes to the object created for runnable
        t.start();//invoking the run state
       /* try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(t.getName()); //used for getting name of which thread is executed
        System.out.println(t1.getName());
        System.out.println("thread in execution");
    }
}
