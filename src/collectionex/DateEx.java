package collectionex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * Created by expert on 7/20/18.
 */
public class DateEx {
    public static void main(String[] args) {


        Date today;
       today  = new Date();
        System.out.println(today.toString());
        SimpleDateFormat sdf;
        sdf=new SimpleDateFormat("MM//dd/yy");
        System.out.println(sdf.format(today));
        LocalDate date= LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
    }
}
