package sample;

import java.rmi.*;
import java.rmi.RemoteException;

/**
 * Created by expert on 8/6/18.
 */


        public interface  Adder extends Remote {
            public  int add(int x,int y)throws RemoteException;
        }


