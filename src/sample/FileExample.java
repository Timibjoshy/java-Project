package sample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expert on 7/19/18.
 */
public class FileExample {
        public static void main(String[] args)throws IOException {
            FileWriter fout=new FileWriter("test.txt");
            fout.write("hello good morning");
            fout.close();
            FileReader fin=new FileReader("test.txt");
            int ch=0;
            while((ch=fin.read())!=-1){
                System.out.println((char)ch);

            }
            String strLine="hello good morning";
            while (strLine!=null){
                String[]words=strLine.split("//s+");
                for (String s:words){
                    System.out.println(s);
                }

            }
            try(FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();

            }



        }

    }

}
