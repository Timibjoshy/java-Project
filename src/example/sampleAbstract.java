package example;

/**
 * Created by expert on 6/29/18.
 */
public class sampleAbstract {
    public static void main(String[] args) {
        Firstinterface a=new Firstinterface() {
            @Override
            public void display() {
                System.out.println("hii");
            }

            @Override
            public int add(int x, int y) {
                return x+y;
            }
        };
        a.display();
        System.out.println(a.add(4,5));
        }
    }

