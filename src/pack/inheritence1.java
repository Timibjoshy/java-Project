package pack;

/**
 * Created by expert on 6/23/18.
 */
public class  inheritence1 extends inheritence {
    int fac_id;
    String name;
    String subject;
    // 3 METHOD
    inheritence1( int dpt_id,String dpt_name,int fac_id,String name,String subject)
    //we can also pass values for child class
    //parent class l parametrized constructor undenkil must aayittum child class te constructor l athu vilikanam
    {
        super(dpt_id, dpt_name);//invoking parent class constructor

        this.fac_id=fac_id;
        this.name=name;
        this.subject=subject;
    }


    public void display() {
        System.out.println("child class");
    }

    public static void main(String[] args) {
        /*inheritence1 f = new inheritence1();
         /*inheritence s=new inheritence();// FIRST method:object created for parent class
        // for print dpt_id,dpt_name
         s.dpt_id=12;
         s.dpt_name="fff";*/
        //2 METHOD:otherwise we can get data f.getdetails(1,"abc")
            //3 METHOD
        inheritence1 d=new inheritence1(45 , "abc",101,"sreekutty", "chemistry");
       //for child class values
        System.out.println(d.dpt_id);
        System.out.println(d.dpt_name);
        System.out.println(d.fac_id);
        System.out.println(d.name);
        System.out.println(d.subject);
    }
}









