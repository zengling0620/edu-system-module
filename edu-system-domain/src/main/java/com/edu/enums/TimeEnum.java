package com.edu.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @description: TimeEnum <br>
 * @date: 2020/4/26 13:03 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum TimeEnum {
    /**
     * 一分钟
     */
    ONE_MINUTES(60),
    /**
     * 一小时
     */
    ONE_HOUR(60 * 60),
    /**
     * 一天
     */
    ONE_DAY(60 * 60 * 24),
    /**
     * 一周
     */
    ONE_WEEK(60 * 60 * 24 * 7),
    /**
     * 一个月
     */
    ONE_MONTH(60 * 60 * 24 * 30);

    private Integer sec;

    public Integer sec() {
        return this.sec;
    }
}
