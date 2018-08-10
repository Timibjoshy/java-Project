package example;

/**
 * Created by expert on 6/13/18.
 */
public class secondL {
    public static int getsecl(int a[],int total)
    {
        int temp;
        for(int i=0;i<total;i++)
        {
            for(int j=i+1;j<total;j++)
            {if (a[i]>a[j])
                {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;

                }
            }
        }
        return a[total-2];
    }

    public static void main(String[] args) {
        {

            int a[]={44,66,99,77,33};

            System.out.println("secondlargest:"+getsecl(a,4));
        }
    }
}
