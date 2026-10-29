package dateAndTime;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
public class dateAndTime {
    //date is store the date in long format and it will store the date in miliseconds since 1 jan 1970
    public static void main(String[] args) {
        long l1 =System.currentTimeMillis();
        System.out.println(l1);
        System.out.println(l1/1000);
        System.out.println(l1/60/60/24/365/1000);

        //date class
        Date  d1 = new Date();
        System.out.println(d1.getDate());

        //calendar class
        //Calendar c1 = new Calendar() ;
    }   
}
