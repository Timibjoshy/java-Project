package example;

/**
 * Created by expert on 6/29/18.
 */
public class sample1 {
    public static void main(String[] args) {
        {
            Firstinterface f=new Firstinterface() {
                @Override
                public void display() {
                    System.out.println("hello");
                }

                @Override
                public int add(int x, int y) {
                    return x+y;
                }
            };
            f.display();
            System.out.println(f.add(2,3));
        }
    }
}
