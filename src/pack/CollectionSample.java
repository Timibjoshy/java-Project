package pack;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by expert on 7/9/18.
 */
public class CollectionSample {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lmap=new LinkedHashMap<>();
        lmap.put("abc",1);
        lmap.put("def",2);
        lmap.put("hhh",3);
        lmap.put("ccc",null);//printed
        lmap.put(null,null);//printed
        for (Map.Entry<String,Integer> obj :lmap.entrySet()) {
            System.out.println("key="+obj.getKey());
            System.out.println("value="+obj.getValue());
        }
    }
}
