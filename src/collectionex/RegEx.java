package collectionex;

import java.util.regex.Pattern;

/**
 * Created by expert on 7/19/18.
 */
public class RegEx {
    public static void main(String[] args) {
        boolean b= Pattern.matches(".s","ss");
        System.out.println(b);
        System.out.println(Pattern.matches("[a-z]","amn"));
        System.out.println(Pattern.matches("[abc]{2}","bb"));
        System.out.println(Pattern.matches("[987]","7"));
        RegEx e=new RegEx();
        System.out.println(Pattern.matches("[//da-z@#$%^]*[@][a-z]{5}[.][com]{3}","timybjoshy@gmail.com"));
        System.out.println();
        System.out.println(Pattern.matches("[0-9]{2}[:][0-9]{2}[:][0-9]{4}","20:10:2018"));
        System.out.println(Pattern.matches("[987]{1}[0-9]{9}","7567459034"));
    }
}
