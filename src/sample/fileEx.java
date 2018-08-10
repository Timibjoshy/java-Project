package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by expert on 7/11/18.
 */
public class fileEx {
    public static void main(String[] args)throws IOException {
     FileOutputStream f=new FileOutputStream("out.txt");
     byte b=(byte)11111;
     f.write(b);
        FileInputStream fin=new FileInputStream("out.txt");

        int i=0;
        System.out.println(fin.read());
       // f.write(10001);
        //FileOutputStream in=newFileOutputStream("out.txt")
        //System.out.println(in.read());
      /*FileInputStream fin=new FileInputStream("out.txt");

        int i=0;
        while((i=fin.read())!=-1){
            System.out.println((char)i);
        }
        String s="hello world";
        byte[] b=s.getBytes();
        //f.write(b);

       fin.close();*/
    f.close();
    }
}
