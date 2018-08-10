package XMLex;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by expert on 8/9/18.
 */
public  class  SAXParserDemo{
    public static void main(String[] args) {
        try{
            File inputFile =new File("sample.txt");
            SAXParserFactory factory=SAXParserFactory.newInstance();
            SAXParser saxParser=factory.newSAXParser();//factory method pattern
            UserHandler userHandler=new UserHandler();
            saxParser.parse(inputFile,userHandler);

        }
        catch (Exception e){
           // e.printStackTrace();
        }
    }
}
