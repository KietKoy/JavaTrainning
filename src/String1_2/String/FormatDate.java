package String1_2.String;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {
        String pattern = "dd-MMMM-yyyy HH:mm:ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        System.out.println("Current time: " + dateFormat.format(new Date()));
    }
}
