package pack;

import java.util.*;


/**
 * Created by expert on 7/6/18.
 */
public class MapEx {
    public static void main(String[] args) {
        //key value pair or entry   key value basics l value entry cheyan
            //hashtable implementation of map interface
        HashMap<String ,Integer>m=new HashMap<>();
        m.put("amal",1234444);
        m.put("abc",9934444);
        m.put(null,9934444);
        m.remove("amal");//to remove entry by key
        for(Map.Entry<String, Integer>obj:m.entrySet()){
            System.out.println("key="+obj.getKey());
            System.out.println("value="+obj.getValue());

        }

    }
}
