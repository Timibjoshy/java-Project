package first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by expert on 7/3/18.
 */
public class CollectionEx {//collection is a single group of objects

    public static void main(String[] args) {
        //genric declaration
        List<String>al=new ArrayList<String>();
       // ArrayList<String>al2=new ArrayList<String>();
       // ArrayList<String>al1=new ArrayList();
        al.add("abc");
        al.add("efg");
        al.add("xyz");
        System.out.println("using for each");//we can iterate using for each,while,Iterator
        for(String obj:al){
            System.out.println(obj+"");
        }
      System.out.println("using iterator");
        Iterator itr=al.iterator();//Iterator is a interface athinte method aanu next,hasnext
        while(itr.hasNext()){
            System.out.println(itr.next()+"");
        }
        System.out.println("/n");
        System.out.println("using for loop");
        for(int i=0;i<al.size();i++){// size nu ulladhu array de size
            System.out.println(al.get(i)+"");
        }
        ArrayList<String>al22= new ArrayList<>();
        al22.add("anu");
        al22.add("anju");
        al.addAll(al22);//to add collection to the first collection
        al.removeAll(al22);
        Iterator itr1=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+"");
        }
    }
}
