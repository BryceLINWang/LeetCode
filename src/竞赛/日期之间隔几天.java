package 竞赛;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 日期之间隔几天 {
    public static int daysBetweenDates(String date1, String date2) {
        SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd");
        Date date11= null;
        Date date22= null;
        try {
            date11 = format1.parse(date1);
            date22 = format2.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar1=Calendar.getInstance();
        calendar1.setTime(date11);
        Calendar calendar2=Calendar.getInstance();
        calendar2.setTime(date22);
        int day1=calendar1.get(Calendar.DAY_OF_YEAR);
        int day2=calendar2.get(Calendar.DAY_OF_YEAR);
        int year1=calendar1.get(Calendar.YEAR);
        int year2=calendar2.get(Calendar.YEAR);
        if (year1!=year2){
            int timesum=0;
            if(year1>year2){
                for(int i=year2;i<year1;i++){
                    if (i%4==0&&i%100!=0||i%400==0){
                        timesum+=366;
                    }else {
                        timesum+=365;
                    }
                }
               return day1+timesum-day2;
            }else {
                for(int i=year1;i<year2;i++){
                    if (i%4==0&&i%100!=0||i%400==0){
                        timesum+=366;
                    }else {
                        timesum+=365;
                    }
                }
                return timesum+(day2-day1);
            }

        }else {

            return Math.abs(day2-day1);
        }
    }

    public static void main(String[] args) {
        String str1="2019-06-30";
        String str2="2019-06-29";
        System.out.println(daysBetweenDates(str1,str2));
    }
}
