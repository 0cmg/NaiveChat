package org.cmg.study.naive.chat.ui.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @CLassName DateUtil
 * @Description TODO
 * @Author cmg
 * @Date 2021/7/2 16:04
 * @Version 1.2
 **/
public class DateUtil {
    SimpleDateFormat nowBegin = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
    SimpleDateFormat nowEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String simpleDate(Date date){
        boolean today = isToday(date);
        if(today){
            return new SimpleDateFormat("HH:mm").format(date);
        }
        return new SimpleDateFormat("yy/MM/dd").format(date);
    }

    private static boolean isToday(Date date){
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);;
        int year1 = c1.get(Calendar.YEAR);
        int moth1 = c1.get(Calendar.MONTH) + 1;
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        Calendar c2 = Calendar.getInstance();
        int year2 = c2.get(Calendar.YEAR);
        int moth2 = c2.get(Calendar.MONTH) + 1;
        int day2 = c2.get(Calendar.DAY_OF_MONTH);

        return year1 == year2 && moth1 == moth2 && day1 == day2;
    }
}
