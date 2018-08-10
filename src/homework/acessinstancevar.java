package homework;

/**
 * Created by expert on 7/31/18.
 */
public class acessinstancevar {
    int stuage;
    public acessinstancevar(String name){//constructor has one parameter
        System.out.println("name:"+name);
    }

    public void setAge(int age) {//another method to pass parameter
        stuage=age;

    }
    public void getAge(int age){//method to get age..must specify parameter type & name
        stuage=age;//assign it
        System.out.println("age"+age);

    }

    public static void main(String[] args) {
        acessinstancevar a=new acessinstancevar("raju");//obj created and parameter pass it
      a.setAge(2);//call first method to get value..
     a.getAge(2);//call second method.
        System.out.println("value:"+a.stuage);//also use this one to acess instance variable

    }

}
