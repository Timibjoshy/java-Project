package collectionex;
import java.util.ArrayList;

/**
 * Created by expert on 6/12/18.
 */
public class bookm {
    public static void main(String[] args) {
        bookk s1=new bookk(101,"abc","gh",12);
        bookk s2=new bookk(102,"aaa","ghh",122);
        ArrayList<bookk>st=new ArrayList();
        st.add(s1);
        st.add(s2);
        for(bookk stlist : st)
        {
            System.out.println("id:"+stlist.id+"name:"+stlist.name+"authour:"+stlist.authour+"price:"+stlist.price);
        }
    }

}
