package com.team.bromall.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 日期时间型的转换函数
 *
 * @author team
 * @version v1.0
 * @date 2019/12/6 10:47
 */
public class DateTimeToDateStr {

    private static String cstToDateStr(String cstDateStr) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        Date date = sdf.parse(cstDateStr);
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    public static void main(String[] args) throws Exception {
        String cstDateStr = "Sat Sep 15 12:24:27 CST 2018";
        System.out.println(cstToDateStr(cstDateStr));
    }
}
