package top.gtf35.beautifyutils.utils;

import java.util.Calendar;

public class DateUtils {

    public static int getYEAR(){
        Calendar now = Calendar.getInstance();
        return  now.get(Calendar.YEAR);
    }

    public static int getMONTH(){
        Calendar now = Calendar.getInstance();
        return  now.get(Calendar.MONTH) + 1;
    }

    public static int getDAY(){
        Calendar now = Calendar.getInstance();
        return  now.get(Calendar.DAY_OF_MONTH);
    }

    public static int getHOUR(){
        Calendar now = Calendar.getInstance();
        return  now.get(Calendar.HOUR_OF_DAY);
    }

    public static int getMin(){
        Calendar now = Calendar.getInstance();
        return  now.get(Calendar.MINUTE);
    }

    public static int getSECOND(){
        Calendar now = Calendar.getInstance();
        return  now.get(Calendar.SECOND);
    }
}
