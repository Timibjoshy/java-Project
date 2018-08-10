package sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by expert on 7/19/18.
 */
public class splitX {
    public static void main(String[] args) throws IOException {
        FileWriter fout = new FileWriter("test.txt");
        fout.write("hello good morning");
        fout.close();
        FileReader fin = new FileReader("test.txt");
        /*int ch=0;
        while((ch=fin.read())!=-1){
            System.out.println((char)ch);

        }*/

        List<String> list = new ArrayList<String>();
        //List<String >good=new ArrayList<String>();
        //List<String >morning=new ArrayList<String>();
        for (String line : list) {
            String[] res = line.split(";");
            list.add(res[0]);
            list.add(res[1]);
            list.add(res[2]);
            System.out.println(list);
            int ch;
            while ((ch = fin.read()) != -1) {
                System.out.println(ch);


            }

        }
    }
}
