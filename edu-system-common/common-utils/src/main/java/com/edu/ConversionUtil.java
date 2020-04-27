package com.edu;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: ConversionUtil <br>
 * @date: 2020/1/9 12:45 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
@Slf4j
public class ConversionUtil {
    /**
     * 对象转化为Map
     *
     * @param object
     * @return
     */
    public static Map<String, Object> modelToMap(Object object) {
        Map<String, Object> map = new HashMap();
        try {
            for (Field field : object.getClass().getDeclaredFields()) {
                boolean flag = field.isAccessible();
                field.setAccessible(true);
                Object o = field.get(object);
                if (null != o) {
                    map.put(field.getName(), o);
                }
                field.setAccessible(flag);
            }
        } catch (IllegalAccessException e) {
            log.error("对象-->Map失败",e);
        }
        return map;
    }
}
