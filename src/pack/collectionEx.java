package pack;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Created by expert on 7/6/18.
 */
public class collectionEx {
    public static void main(String[] args) {
      /* // HashSet <String>al=new HashSet<>();//alla clz tem parent cls object aanu
        HashSet al1=new HashSet();
        al1.add("abc");
        al1.add("rrt");
        al1.add("ttt");
        al1.add(12);     //there are 2 methods to initilize Hashset//in first method is generic declaration,data type is specified
        al1.add(30);//so we can add only string values then the for each become//  for(String o:al){ sout(o); }
        for(Object o:al1){
            System.out.println(o);
        }*/
      HashSet<String>al=new HashSet<>();
     // HashSet al1=new HashSet();
        LinkedHashSet<String>LinkedHashSet=new LinkedHashSet<>();
        LinkedHashSet.add("abc");
        LinkedHashSet.add("tyyn");
        LinkedHashSet.add(null);
        LinkedHashSet.add(null);//only one null values are printed
        for(String o:LinkedHashSet){
            System.out.println(o);
        }

    }
}
//second method is used in program
//in second we can initilize without defining datatype therefore in foreach we must specify object as datatype