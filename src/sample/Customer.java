package sample;

import java.util.Scanner;

/**
 * Created by expert on 7/19/18.
 */
public class Customer {
    int amount=1000;
    synchronized  void withdraw(int amount){
        System.out.println("going to withdraw");
        if(this.amount<amount){
            System.out.println("less balence;waiting for deposit");
            try{
                wait();}
                catch(Exception e){}
            }
            this.amount-=amount;
        System.out.println("withdraw completed");
        }
        synchronized  void deposit(int amount){
            System.out.println("going to deposit");
            this.amount+=amount;
            System.out.println("deposit completed");
            notify();//waiting l erikunna function ee invoke cheyan
    }
    static class Thread1 extends  Thread{
        Customer c;
            Thread1(Customer c){
                this.c=c;

            }
            public void run(){
                c.withdraw(15000);
                }
            }
          static   class Thread2 extends Thread{
           Customer c;
            Thread2(Customer c){
                this.c=c;
            }
            public void run(){
                c.deposit(10000);
            }
    }
    public static class  test{
        public static void main(String[] args) {

            Customer obj=new Customer();
            Thread1 t1=new Thread1(obj);
            Thread1 t2=new Thread1(obj);
            Thread2 t3=new Thread2(obj);
            t1.start();
            t2.start();
            t3.start();
        }
    }
}
