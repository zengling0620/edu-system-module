package com.edu;

import org.junit.Test;

import java.util.HashMap;

/**
 * @description: JsonUtilTest <br>
 * @date: 2019/12/26 9:59 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
public class JsonUtilTest {
    @Test
    public void map2json() {
        JsonUtil jsonUtil = new JsonUtil();
        HashMap map = new HashMap();
        map.put("id", "01");
        map.put("name", "demo");
        System.out.println("map = " + map);
        String result = jsonUtil.map2json(map);
        System.out.println("json = " + result);
    }
}
