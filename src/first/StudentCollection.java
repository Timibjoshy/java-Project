package first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by expert on 7/3/18.
 */
public class StudentCollection {
    int rollnumber;
    String studentname;
    int age;

    public StudentCollection(int rollnumber,String studentname,int age) {
        this.rollnumber= rollnumber;
        this.studentname=studentname;
        this.age=age;
    }


    public static void main(String[] args) {
        ArrayList<StudentCollection>al=new ArrayList<>();
        StudentCollection s=new StudentCollection(1,"abc",12);
        StudentCollection s2=new StudentCollection(2,"def",13);
        al.add(s);
        al.add(s2);
        al.remove(s2);//for removing
        Iterator i=al.iterator();
        while(i.hasNext()){
            StudentCollection s1=(StudentCollection)i.next();
            System.out.println(s1.rollnumber+""+s1.studentname+""+s1.age);
        }


    }
}
