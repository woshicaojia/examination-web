package com.example.examonlineweb.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 自定义时间类
 */
public class TimeUtils {
    /**
     * 获取当前时间
     * @return 当前时间的字符串形式
     */
    public static String getCurrentTime(){
        //java8获取当前时间
        LocalDateTime time = LocalDateTime.now();
        //当前时间格式化
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return format.format(time);
    }
}
