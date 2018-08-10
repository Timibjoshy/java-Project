package homework;

/**
 * Created by expert on 7/31/18.
 */
public class EmployeCons {
    String name;
    int age;
    String designation;
    int salary=500;

    public void employeename(String name) {
        System.out.println(name);
        name = name;
    }

    public int age(int age) {
        age = age;
        System.out.println(age);
      return age;
    }
    public void setDesignation(String designation){
        designation=designation;
        System.out.println(designation);
    }
    public  void setSalary(int salary){
        System.out.println(salary);
        salary=salary;

    }

    public static void main(String[] args) {
        EmployeCons e=new EmployeCons();
        e.employeename("raju");
       e.age(20);
       e.setSalary(400);

        e.setDesignation("proffessor");

    }
}


