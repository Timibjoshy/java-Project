package first;

/**
 * Created by expert on 6/27/18.
 */
public class Department {
    int dptid;
    String dptname;
    public Department(int dptid,String dptname){//if we use a parameterized constructor in parent class
                                                //then the first word under the parametrized constructor is super.
        this.dptid=dptid;
        this.dptname=dptname;
    /*Department(){
        System.out.println("constructor of parent class");*/
    }
    public void display(){
        System.out.println("parent class method");
    }
}
