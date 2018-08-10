package first;

/**
 * Created by expert on 6/27/18.
 */
public class calculation {
    int z;
    public void display(int x,int y)
    {
        int avg=(x+y)/2;
        System.out.println("average of 2 numbers"+avg);
    }
    public void addition(int x,int y){
        z=x+y;
        System.out.println("addition of 2 numbers="+z);
    }
    public void sub(int x,int y){
        z=x-y;
        System.out.println("substration of 2 numbers="+z);
    }
    calculation(){
        System.out.println("calculation completed");
    }

}
