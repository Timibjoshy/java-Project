package modifier;

import java.util.LinkedList;

/**
 * Created by expert on 7/5/18.
 */
public class LinkedListEx {
    public static void main(String[] args) {
        //non generic declartion
        LinkedList al=new LinkedList();
        LinkedList<String>al1=new LinkedList<>();
        al.add("aa");
        al1.add("anu");
        al1.add("sree");
        al1.addLast("abc");
        al1.addFirst("efg");
        al1.removeFirst();
        for (String x:al1){
            System.out.println(x);
        }
    }
}
