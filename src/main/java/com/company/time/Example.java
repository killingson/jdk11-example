package com.company.time;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Time convert
 *
 * @author liujiada
 * @date 2021/7/25
 */
public class Example {

    public static void main(String[] args) {
        long day = TimeUnit.DAYS.convert(Duration.ofHours(24));
        System.out.println(day == 1);

        // 1 天
        System.out.println(TimeUnit.DAYS.convert(Duration.ofHours(26)));

        // 1 分钟
        System.out.println(TimeUnit.MINUTES.convert(Duration.ofSeconds(60)));
    }

}
