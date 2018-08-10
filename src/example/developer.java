package example;

/**
 * Created by expert on 6/13/18.
 */
public class developer extends employee {
    float bonous = 1000;
    int salary=600;
    String empname="abc";

    {
        System.out.println("name:" + empname);
        System.out.println("empsalary:" + salary);
        System.out.println("empbonous:" + bonous);

    }

    public static void main(String[] args) {
        developer d=new developer();
       d.empname="abc";
        d.salary=600;
    }

}