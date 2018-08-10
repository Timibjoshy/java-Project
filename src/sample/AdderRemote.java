package sample;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by expert on 8/6/18.
 */
public class AdderRemote extends UnicastRemoteObject implements Adder {
    AdderRemote()throws RemoteException{
        super();
    }
    public  int add(int x,int y){
        return x+y;
    }
}
