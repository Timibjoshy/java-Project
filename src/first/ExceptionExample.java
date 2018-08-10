package first;
import java.io.IOException;
/**
 * Created by expert on 7/3/18.
 *///RUN TIME EXCEPTION
public class ExceptionExample {//compile time l ella function lum throw cheyanam
    public void first() throws IOException {
        second();
    }

    public void second() throws IOException {
        third();
    }

    public void third() throws IOException{
        throw new ArithmeticException("exception");//throw is always use inside the method after throw word there is a object
    }

    public static void main(String[] args) {
        ExceptionExample e = new ExceptionExample();
        try {
            e.first();
        } catch (Exception ex) {
            System.out.println("exception propagated");
        }
    }
}
//exception l highest one throwable aanu
//compile time propagation l namal throw,throws use cheyanam