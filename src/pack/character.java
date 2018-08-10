package pack;

/**
 * Created by expert on 6/22/18.
 */
public class character {
    public static void main(String[] args) {
        String j="abc";                     //declare using string literals
        String s="abc";
        String s1="abc";
        String s3="ABC";
        j=j.concat("def");                 //for joining
        System.out.println(j);
        System.out.println(s==s3);//check reference
        System.out.println(s.equals(s1));
        System.out.println(s.equals(j));
        System.out.println(s.equals(s3));  //case sensitive
       // String k=new String("def") using new keyword

    }
}
