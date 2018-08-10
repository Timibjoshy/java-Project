package modifier;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by expert on 7/5/18.
 */
public class Employe {
    String empname;
    float salary;
    String dept;

    public Employe(String empname, float salary, String dept) {
        this.empname = empname;
        this.salary = salary;
        this.dept = dept;
    }
    public static void display(LinkedList<Employe>e) {
        Iterator itr = e.iterator();//Iterator is a interface athinte method aanu next,hasnext
        while (itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }

    public static void main(String[] args) {
        LinkedList<Employe> al = new LinkedList<Employe>();
        Employe b = new Employe("abc", 1000, "supervisor");
        Employe b1 = new Employe("efg", 2000, "clerk");
        al.add(b);
        al.add(b1);

       /* for (Employe a : al){
            System.out.println(a.empname+" "+a.salary+" "+a.dept+" ");
        }*/
   display(al);
    }
}
