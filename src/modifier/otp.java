import java.util.*;


/**
 * Created by expert on 6/19/18.
 */
public class otp {
    public static void main(String[] args) {
        String s1,s2,s3,s4;
        s1="ABCDEF";
        s2="hgjik";
        s3="123456";
        s4=s1+s2+s3;
        String otp="";
        Random r=new Random();
        for(int i=0;i<6;i++)
        {
            otp=otp+s4.charAt(r.nextInt(s4.length()));
        }
        System.out.println("Generated otp is:"+otp);

    }
}
