package pack;

import modifier.stud;

/**
 * Created by expert on 6/11/18.
 */
public class student extends stud{
    student(int id),String name){
    super(id,name);
    }
    public static void main(String[] args) {

        stud s= new stud(20,"abcd");
        stud s2 =new stud(25,"xyz");
        s.id=20;
        s.name="AB";
        s.display();
        s2.display();
    }
}
