package pack;

/**
 * Created by expert on 6/29/18.
 */
public class AcessM extends AcessMod {


    public static void main(String[] args) {
        AcessMod d=new AcessMod();
        d.studentname="ABCD";
        d.setStudentid(1);
        d.setMark(500);
       // int a=d.getStudentid();      or
        System.out.println(d.getStudentid());
        System.out.println(d.getMark());
        System.out.println(d.studentname);



    }
}
