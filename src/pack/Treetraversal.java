package pack;

import java.util.TreeSet;

/**
 * Created by expert on 7/6/18.
 */
public class Treetraversal {
    public static void main(String[] args) {
        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("def");
        treeSet.add("wewe");
        treeSet.add("ggh");
        for(String o:treeSet){//no null & duplicate values in tree
            System.out.println(o);
        }
    }
}
