package example;

/**
 * Created by expert on 6/13/18.
 */
public class maxex {
    public static void main(String[] args)

        {
            int ar[]={10,20,30,40,50};
            int max=ar[0];
            for(int i=1;i<ar.length;i++)
            {
                if(ar[i]>max)
                {
                    max=ar[i];

                }
            }
            System.out.println("maximum is:"+max);

        }}


