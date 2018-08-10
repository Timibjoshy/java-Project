package example;

/**
 * Created by expert on 6/28/18.
 */
public class interfaceEx implements Firstinterface{

    @Override
    public void display() {
        System.out.println("interface example");
    }

    @Override
    public int add(int x, int y) {
        return x+y;
    }

    public static void main(String[] args) {
        interfaceEx obj=new interfaceEx();

        System.out.println(obj.add(2,3));//or obj.add(2,3);
        obj.display();
        /*or
        Firstinterface f=new interfaceEx
        f.add(2,3);
        f.display();*/

    }
}
