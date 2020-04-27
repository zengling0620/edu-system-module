package com.edu;

import org.apache.commons.lang.StringUtils;

/**
 * @description: StringUtil <br>
 * @date: 2020/4/26 14:53 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
public class StringUtil {
    /**
     *  格式化字符串(替换符自己指定)
     */
    public static String formatIfArgs(String format, String replaceOperator, Object... args) {
        if (StringUtils.isEmpty(format) || StringUtils.isEmpty(replaceOperator)) {
            return format;
        }
        format = StringUtils.replace(format, replaceOperator, "%s");
        return formatIfArgs(format, args);
    }

    /**
     *  格式化字符串（替换符为%s）
     */
    public static String formatIfArgs(String format, Object... args) {
        if (StringUtils.isEmpty(format)) {
            return format;
        }
        return (args == null || args.length == 0)  ? String.format(format.replaceAll("%([^n])", "%%$1")) : String.format(format, args);
    }
}
