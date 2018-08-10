package sample;

import java.rmi.*;

/**
 * Created by expert on 8/6/18.
 */
public class Myserver {
    public static void main(String[] args) {
        try{
            Adder stub=new AdderRemote();
            Naming.rebind("rmi://localhost:5000/sonoo",stub);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
