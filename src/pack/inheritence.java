package pack;

/**
 * Created by expert on 6/23/18.
 */
public class inheritence {
    int dpt_id;
    String dpt_name;

    inheritence(int d,String s){


        dpt_id=d;
        dpt_name=s;
    }


    public void getdata()//we can get value from parent class by declaring
    // public void getdata(int x,String y)
    {
        System.out.println("parent method");
    }

}

