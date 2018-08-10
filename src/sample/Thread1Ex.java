package sample;

/**
 * Created by expert on 7/17/18.
 */
public class Thread1Ex {
    /*int x;
    public Thread1Ex(int x){
        this.x=x;

    }*/
    static synchronized public void display(int x){
        // at a time l oru thread execute cheyanam athina sysnchronized use cheyunne
//static synchorinzed koduthal entire class nu lock varum..
        for (int i=0;i<5;i++){
            System.out.println(i*x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
