package com.tomtop.zhizi.datacenter.tools;

//y   = year   (yy or yyyy)
//M   = month  (MM)
//d   = day in month (dd)
//h   = hour (0-12)  (hh)
//H   = hour (0-23)  (HH)
//m   = minute in hour (mm)
//s   = seconds (ss)
//S   = milliseconds (SSS)
//z   = time zone  text        (e.g. Pacific Standard Time...)
//Z   = time zone, time offset (e.g. -0800)

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    public static String convert(String dateStr, String srcFormat, String dstFormat) throws ParseException {
        SimpleDateFormat src = new SimpleDateFormat(srcFormat);
        SimpleDateFormat dst = new SimpleDateFormat(dstFormat);
        return dst.format(src.parse(dateStr));
    }

    public static String convert(Date date, String dstFormat) throws ParseException {
        SimpleDateFormat dst = new SimpleDateFormat(dstFormat);
        return dst.format(date);
    }
}
