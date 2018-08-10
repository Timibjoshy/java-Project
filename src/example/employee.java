package example;

/**
 * Created by expert on 6/13/18.
 */
public class employee {
    int dptid;
    String dptname;
    static final String collegename; //class final aanenkil athone extend cheyan pattum
    final String v="abcd";//assign values
    static{
        collegename="ABC college";

    }
    public final void display(){//Final method-we can extend to another class but do not be override
        System.out.println("final function");
    }
    employee(){

    }
    public employee(int dptid,String dptname){
        dptid=dptid;
        this.dptname=dptname;

    }

}
