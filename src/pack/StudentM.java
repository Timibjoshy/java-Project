package pack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expert on 7/9/18.
 */
public class StudentM {
    int id;
    String name;
    int mark;

    public StudentM(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

        public static void main(String[] args) {

            {
                HashMap<Integer, StudentM> m = new HashMap<>();
                StudentM s1 = new StudentM(1, "abc", 33);
                StudentM s2 = new StudentM(1, "abc", 33);
                m.put(1, s1);
                m.put(2, s2);

                for (Map.Entry<Integer, StudentM> obj : m.entrySet()) {
                    StudentM s4 = obj.getValue();

                    System.out.println("key=" + obj.getKey());
                     //System.out.println("value=" + obj.getValue());
                    System.out.println(s4.id + " "+  s4.name   + ""  +   s4.mark+ "");

                }
            }
        }
    }


