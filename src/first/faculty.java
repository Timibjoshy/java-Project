package first;

/**
 * Created by expert on 6/27/18.
 */
public class faculty extends Department { //uses of inheritence 1.method overriding 2.code reusability
    int facid;
    String name;
    String number;
    public void display(){
        System.out.println("method in child class");//method overriding
    }
 /*   public faculty(){
        super(8,"mmm");// by default it is presented so there is no need to call parent class
        System.out.println("Constructor of child class");
    }*/
   public faculty(int dptid,String dptname,int facid,String name,String number){
       super(dptid,dptname);//it be the first statement
       this.facid=facid;
       this.name=name;
       this.number=number;
       System.out.println("constructor of child class");
   }

    public static void main(String[] args) {
       faculty b=new faculty(101,"CSE",1,"abc","123456");
       b.display();
        System.out.println("dptid:" + b.dptid + "dname:"+b.dptname+"facid:"+b.facid+"name:"+b.name+"number:"+b.number);
  //  faculty b=new faculty();
   // b.display();
    }
}
