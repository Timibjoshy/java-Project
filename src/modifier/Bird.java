package modifier;

/**
 * Created by expert on 6/18/18.
 */
public class Bird {
    final static int speed;
    static{
        speed=200;
    }
    void displaySpeed(){
        System.out.println("speed:"+speed);
    }

    public static void main(String[] args) {
        Bird b= new Bird();
        b.displaySpeed();
    }
}
