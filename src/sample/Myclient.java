package sample;

import java.rmi.*;

/**
 * Created by expert on 8/6/18.
 */
public class Myclient {
    public static void main(String[] args) {
        try {
            Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/sonoo");
            System.out.println(stub.add(34, 4));
        } catch (Exception e) {
        }
    }
}
