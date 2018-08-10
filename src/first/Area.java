package first;

/**
 * Created by expert on 6/27/18.
 */
public class Area {
    public void findArea(float r){
    System.out.println("area="+(3.14*r));
}
    public void findArea(float x,float y){
        System.out.println("area="+(x*y));
    }
    public void findArea(int a,int b){
        System.out.println("area="+(a*b));
    }

    public static void main(String[] args) {
        Area obj=new Area();
        obj.findArea(5);
        obj.findArea(3,5);
        obj.findArea(3.0f,5.5f);
    }
}

