package sample;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by expert on  7/11/18.
 */
public class FileEx1 {
    public static void main(String[] args) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        String s=obj.readLine();
        System.out.println(""+s);
    }
}//namal type cheyunnadhhu print aayi varan
