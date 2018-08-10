import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;


/**
 * Created by expert on 6/19/18.
 */
public class Arraycopy {
    public static void main(String[] args) {
        int z;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        z=s.nextInt();
        int ar[]=new int[z];
        Random r=new Random();
        for(int i=0;i<z;i++)
        {
            ar[i]=r.nextInt(5);

        }
        System.out .println(Arrays.toString(ar));

    }

}
