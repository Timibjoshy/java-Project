import java.util.StringTokenizer;

/**
 * Created by expert on 6/26/18.
 */
public class StringTokenExample {
    public static void main(String[] args) {
        StringTokenizer tokenizer=new StringTokenizer("hi hello,how,r,u",",");//tokenize string
        //use "," or( )space as delim to seperate string
        while(tokenizer.hasMoreTokens()){//for iterating number of strings
            System.out.println(tokenizer.nextToken());//to print values
        }
    }
}
