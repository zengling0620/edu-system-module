package com.edu;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import net.sf.json.xml.XMLSerializer;

import java.util.Map;

/**
 * @description: JsonUtil <br>
 * @date: 2019/12/24 16:31 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
@Slf4j
public class JsonUtil {
    /**
     * 将数组转换成String类型的Json数据格式
     *
     * @param objects
     * @return
     */
    public static String array2json(Object[] objects) {
        JSONArray jsonArray = JSONArray.fromObject(objects);
        return jsonArray.toString();
    }

    /**
     * list转成String类型的Json
     *
     * @param objects
     * @return
     */
    public static String list2json(Object[] objects) {
        JSONArray jsonArray = JSONArray.fromObject(objects);
        return jsonArray.toString();
    }

    /**
     * object集合转换成String的Json
     *
     * @param object
     * @return
     */
    public static String object2json(Object[] object) {
        JSONObject jsonObject = JSONObject.fromObject(object);
        return jsonObject.toString();
    }

    /**
     * map-json
     *
     * @param map
     * @return
     */
    public static String map2json(Map map) {
        JSONObject jsonObject = JSONObject.fromObject(map);
        return jsonObject.toString();
    }

    /**
     * xml-Json
     *
     * @param xml
     * @return
     */
    public static String xml2Json(String xml) {
        JSONArray jsonArray = (JSONArray) new XMLSerializer().read(xml);
        return jsonArray.toString();
    }

    public static JsonConfig configJson(String[] excludes) {
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.setExcludes(excludes);
        jsonConfig.setIgnoreDefaultExcludes(true);
        jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
        return jsonConfig;
    }
}
