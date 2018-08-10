package example.homework;

import java.util.Scanner;

/**
 * Created by expert on 7/11/18.
 */
public class StudentDetails {
    int rollno;
    int id;
    String name;

    public StudentDetails(int rollno, int id,String name){
        this.rollno = rollno;
        this.id = id;
        this.name=name;
    }//parametrized constructor annu use cheyunnadhu enkil object create cheythuathil koody value pass cheyam

    public static void main(String[] args) {
        StudentDetails d=new StudentDetails(3,1,"abc");
        System.out.println(d.id+""+d.rollno+""+d.name+"");
    }

}
