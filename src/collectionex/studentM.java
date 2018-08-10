package collectionex;

/**
 * Created by expert on 6/12/18.
 */import java.util.ArrayList;
public class studentM {
    public static void main(String[] args) {
        ArrayList<studd>st=new ArrayList();
        studd s1=new studd(101,"xyz",44);
        studd s2=new studd(102,"abc",98);
        st.add(s1);
        st.add(s2);
        for(studd stlist:st)
        {
            System.out.println("id:"+stlist.id+"name:"+stlist.name+"marks:"+stlist.marks);
        }
    }
}
