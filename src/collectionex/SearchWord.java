package collectionex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by expert on 7/20/18.
 */
public class SearchWord {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("hello");
        Matcher m=p.matcher("hello hi hello");
        boolean b=false;
        while (m.find()) {
            System.out.println("found" + m.group() + "at start index" + m.start() + "and ending index at" + m.end());
            b = true;
        }
        if(b==false){
            System.out.println("not found");
        }
    }
}
