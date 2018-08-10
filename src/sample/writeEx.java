package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by expert on 7/12/18.
 */
public class writeEx {
    public static void main(String[] args) throws IOException{
        File f=new File("firspro","input");//create a file named firspro
        f.mkdirs();//create a directory
        System.out.println(f.exists());//check if the directory is created

        File f1=new File("sample","file1.txt");//creating a file under directory
        f1.getParentFile().mkdirs();
        f1.createNewFile();
        System.out.println(f.getPath());//print path of file
        System.out.println(f.getAbsolutePath());//print full path
        File f4=new File("sample.txt");
        f4.createNewFile();
        FileOutputStream f5=new FileOutputStream(f4);
        f5.write(3);
        f5.close();
        FileInputStream f6=new FileInputStream(f4);
        System.out.println(f6.read());



    }
}
