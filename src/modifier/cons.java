package modifier;

/**
 * Created by expert on 6/21/18.
 */
public class cons {

    int roll_no;
    String name;
    cons(){

    }

    cons(int a,String b){//dont want to pass the declared variables,use variables a,b.
        //instead  we can use int roll_no,String name
        this.roll_no=a;//this.roll_no=roll_no;
        this.name=b;//this.name=name;
    }

    public static void main(String[] args) {
        cons s=new cons();//default constructor
        cons s1=new cons(1,"anu");//parameterized constructor
        System.out.println(s.roll_no+""+s.name);
        System.out.println(s1.roll_no+""+s1.name);

    }
}

