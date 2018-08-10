package first;

/**
 * Created by expert on 6/27/18.
 */
public class my_calculation extends calculation{
    int z;

    public void mul(int x,int y){
        z=x*y;
        System.out.println("multiplication of 2 numbers="+z);
    }

    public static void main(String[] args) {
        my_calculation c=new my_calculation();
        c.mul(2,4);
        c.addition(3,4);
        c.sub(3,7);
        c.display(30,30);

    }

}
