package sample;

import java.io.*;

/**
 * Created by expert on 7/20/18.
 */
public class Replace {
        public static void main(String args[])throws IOException
        {
            try
            {
                FileWriter fout=new FileWriter("output.txt");
                fout.write("hello good morning");
                fout.close();
               /* File file = new File("file.txt");
                BufferedReader reader = new BufferedReader(new FileReader(file));*/
                String line = "", oldtext = "";
                while((line  != null))
                {
                    oldtext += line + "\r\n";
                }
                // replace a word in a file
                String newtext = oldtext.replaceAll("hello good morning", "hello good day ");

                //To replace a line in a file
               // String newtext = oldtext.replaceAll("This is test string 20000", "blah blah blah");

               /* FileWriter fout = new FileWriter("output.txt");
                fout.write(newtext);
                fout.close();*/
                System.out.println(newtext);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }



