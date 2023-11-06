import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        Calendar cal1 = Calendar.getInstance();
        Date can1 = cal1.getTime();

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd    hh:mm:ss a    z D");
        formatter.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        String formattedDate = formatter.format(can1);
        System.out.println("\u001B[34mNew York, America -> \n              \u001B[35m" + formattedDate);

                    /////////////////////////////

        Calendar cal2 = Calendar.getInstance();
        Date can2 = cal2.getTime();

        formatter.setTimeZone(TimeZone.getTimeZone("Europe/Zaporozhye"));
        String formattedDate2 = formatter.format(can2);
        System.out.println("\u001B[34mZaporozhye, Europe -> \n              \u001B[35m" + formattedDate2);

                ////////////////////////////////////////////

        Calendar cal3 = Calendar.getInstance();
        Date can3 = cal3.getTime();

        formatter.setTimeZone(TimeZone.getTimeZone("Africa/Nairobi"));
        String formattedDate3 = formatter.format(can1);
        System.out.println("\u001B[34mNairobi, Africa -> \n              \u001B[35m" + formattedDate3);
        ////////////////////////////////////////////

        Calendar cal4 = Calendar.getInstance();
        Date can4 = cal4.getTime();

        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        String formattedDate4 = formatter.format(can4);
        System.out.println("\u001B[34mHo_Chi_Minh, Asia -> \n              \u001B[35m" + formattedDate4);


    }
}