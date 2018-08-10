package collectionex;
import java.util.ArrayList;
/**
 * Created by expert on 6/12/18.
 */
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList <String>names=new ArrayList <String>();
        names.add("ac");
        names.add("bc");
        names.add("ad");
        names.add("bs");
        names.add(null);
        for(String s:names)
        {
            System.out.println(s);
        }

    }
}//arraylist l duplicate values add cheyam
//if we want to iterate in another function then first we have to pass arraylist to that function for
//that we have to declare arraylist in that function
//for eg:
/*public class samplex
{

public samplex(int a,int b){
}
public static void printlist(ArrayList<samplex>a,samplex s){
s.add(s);
}

    public static void main(String[] args) {


        {
            ArrayList<samplex> al = new ArrayList<>();
            samplex obj = new samplex(1, 2);
            ArrayList<String> al1 = new ArrayList<>();
            al1.add("one");
            al1.add("one");
            al1.add(null);
            for (String o : al1) {
                System.out.println(o);
            }

        }
    }*/
