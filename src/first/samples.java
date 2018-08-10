package first;

/**
 * Created by expert on 6/29/18.
 */
import pack.AcessMod;

public class samples extends AcessMod {
    public static void main(String[] args) {
        //AcessMod m=new AcessMod(); we cant create object for parent class in cases that the parent class is in another package

    //in case of different package
        samples s=new samples();//create object for child class
        s.setMark(400);
        s.setStudentid(3);
        System.out.println(s.getMark());
        System.out.println(s.getStudentid());

    }

}
