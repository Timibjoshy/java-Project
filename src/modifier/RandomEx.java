package modifier;

import java.util.Random;
/**
 * Created by expert on 6/18/18.
 */
public class RandomEx {
    public static void main(String[] args) {
        Random r=new Random();
        int i;
        int j=r.nextInt(60);
        System.out.println(j);
        /*for(i=0;i<5;i++)
            System.out.println(r.nextInt(5));*/
    }
}
