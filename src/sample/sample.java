package sample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expert on 7/12/18.
 */
public class sample {
    public static void main(String[] args) throws IOException{
        FileWriter fout=new FileWriter("output.txt");//creating file
        fout.write("hello");//write anything to display in file
        fout.close();//close it
        System.out.println("reading from first");//at the time of creating file we try to write another file
       FileReader fin=new FileReader("output.txt");//reading file
       int ch=0;
       FileWriter s=new FileWriter("new.txt");//write another file
       while((ch=fin.read())!=-1){//iterate when it not equal to -1
           System.out.println((char)ch);//print it
           s.write(ch);
       }
       s.close();//close it
        System.out.println();
        FileReader l=new FileReader("new.txt");//reading new file
        int e=0;
        while((ch=l.read())!=-1){
            System.out.println((char)e);


        }

    }
}
