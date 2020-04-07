package com.edu;

import com.edu.exception.ConversionException;
import lombok.var;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: ConversionUtil <br>
 * @date: 2020/1/9 12:45 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
public class ConversionUtil {
    /**
     * 对象转化为Map
     *
     * @param object
     * @return
     */
    public static Map<String, Object> modelToMap(Object object) {
        Map<String, Object> map = new HashMap();
        for (Field field : object.getClass().getDeclaredFields()) {
            try {
                boolean flag = field.isAccessible();
                field.setAccessible(true);
                Object o = field.get(object);
                if (null != o) {
                    map.put(field.getName(), o);
                }
                field.setAccessible(flag);
            } catch (Exception e) {
                throw new ConversionException("Object->Map Exception:" + e.getMessage());
            }
        }
        return map;
    }
}
