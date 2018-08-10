package pack;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by expert on 7/9/18.
 */
public class EmployeeMapEx {
        public static void main (String args[]){
            //Here Insertion order maintains
            Map<Integer, String>lmap = new LinkedHashMap<Integer, String>();
            lmap.put(12, "Mahesh");
            lmap.put(5, "Naresh");
            lmap.put(23, "Suresh");
            lmap.put(9, "Sachin");
            System.out.println("LinkedHashMap before modification" + lmap);
            System.out.println("Is Employee ID 12 exists: " +lmap.containsKey(12));
            System.out.println("Is Employee name Amit Exists: "+lmap.containsValue("Mahesh"));
            System.out.println("Total number of employees: "+ lmap.size());
            System.out.println("Removing Employee with ID 5: " + lmap.remove(5));
            System.out.println("Removing Employee with ID 3 (which does not exist): " + lmap.remove(3));
            System.out.println("LinkedHashMap After modification" + lmap);
        }
    }

