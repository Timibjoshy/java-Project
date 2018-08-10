package pack;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by expert on 7/9/18.
 */
public class HousemapEx {
    int houseno;
    String adress;
    int phno;

    public HousemapEx(int houseno, String adress, int phno) {
        this.houseno = houseno;
        this.adress = adress;
        this.phno = phno;
    }

    public static void main(String[] args) {
        TreeMap<Integer, HousemapEx> m = new TreeMap<>();
        HousemapEx s1 = new HousemapEx(1, "bhavan", 3455566);
        HousemapEx s2 = new HousemapEx(2, "rosevilla", 8909095);
        HousemapEx s3 = new HousemapEx(3, "amala bhavan", 8986664);
        m.put(1, s1);
        m.put(2, s2);
        m.put(3, s3);
        for (Map.Entry<Integer,HousemapEx> obj : m.entrySet()) {

           HousemapEx s4 = obj.getValue();
          //  System.out.println(s4.houseno+ ""+s4.adress+ ""+s4.phno +"");
            System.out.println("key=" + obj.getKey());
            System.out.println("LinkedHashMap before modification" + m);
            System.out.println("Total number of memebers: "+m.size());
            System.out.println("Is Houseno ID 1 exists: " +m.containsKey(1));
            System.out.println("Is house name bhavan Exists: "+m.containsValue("HousemapEx"));
            System.out.println("Removing house with ID 3 (which does not exist): " + m.remove(3));
            System.out.println("LinkedHashMap After modification" + m);
        }
    }
}
