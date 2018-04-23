package com.suixingpay.datas.manager.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author fuzizheng[fu_zz@suixingpay.com]
 */
public class DateMathUtils {

    public final static String PATTERN_LONG_DAY = "yyyy-MM-dd";
    public final static String PATTERN_SHORT_DAY = "yyyyMMdd";

    public final static String PATTERN_LONG_MONTH = "yyyy-MM";
    public final static String PATTERN_SHORT_MONTH = "yyyyMM";

    public final static String PATTERN_LONG_SECOND = "yyyy-MM-dd HH:mm:ss";

    public final static String PATTERN_LONG_MILLISECOND = "yyyy-MM-dd HH:mm:ss:SSS";

    /**
     * 日期格式转化
     *
     * @param pattern
     * @param date
     * @return
     */
    public static Date parseDate(String pattern, String date) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date d = null;
        try {
            d = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }

    /**
     * 日期运算
     *
     * @param date
     * @param calendarType
     * @param account
     * @return
     */
    public static Date mathDate(Date date, int calendarType, int account) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendarType, account);
        return calendar.getTime();
    }

    /**
     * 获取加减年份后的日期 String
     *
     * @param pattern
     * @param date
     * @param year
     * @return
     */
    public static String dateAddYears(String pattern, String date, int year) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(mathDate(parseDate(pattern, date), Calendar.YEAR, year));
    }

    /**
     * 获取加减年份后的日期 Date
     *
     * @param date
     * @param year
     * @return
     */
    public static Date dateAddYears(Date date, int year) {
        return mathDate(date, Calendar.YEAR, year);
    }

    /**
     * 获取加减月份后的日期 String
     *
     * @param pattern
     * @param date
     * @param month
     * @return
     */
    public static String dateAddMonths(String pattern, String date, int month) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(mathDate(parseDate(pattern, date), Calendar.MONTH, month));
    }

    /**
     * 获取加减月份后的日期 Date
     *
     * @param date
     * @param month
     * @return
     */
    public static Date dateAddMonths(Date date, int month) {
        return mathDate(date, Calendar.MONTH, month);
    }

    /**
     * 获取加减天数后的日期 String
     *
     * @param pattern
     * @param date
     * @param day
     * @return
     */
    public static String dateAddDays(String pattern, String date, int day) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(mathDate(parseDate(pattern, date), Calendar.DAY_OF_YEAR, day));
    }

    /**
     * 获取加减天数后的日期 Date
     *
     * @param date
     * @param day
     * @return
     */
    public static Date dateAddDays(Date date, int day) {
        return mathDate(date, Calendar.DAY_OF_YEAR, day);
    }

    /**
     * 获取加减分钟后的日期 String
     *
     * @param pattern
     * @param date
     * @param minute
     * @return
     */
    public static String dateAddMinutes(String pattern, String date, int minute) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(mathDate(parseDate(pattern, date), Calendar.MINUTE, minute));
    }

    /**
     * 获取加减分钟后的日期 Date
     *
     * @param date
     * @param minute
     * @return
     */
    public static Date dateAddMinutes(Date date, int minute) {
        return mathDate(date, Calendar.MINUTE, minute);
    }

}
