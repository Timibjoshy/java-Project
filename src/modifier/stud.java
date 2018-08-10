package modifier;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by expert on 6/11/18.
 */
class stud {

        int id;
        String name;
        stud(int id,String name){

            this.id=id;
            this.name=name;
        }
        public void display()
    {
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }


}
