package com.edu.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 86173
 */
@Component
public class MetaObjectHandlerConfig implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        Object creator = getFieldValByName("creator", metaObject);
        Object modifier = getFieldValByName("modifier", metaObject);
        Object createTime = getFieldValByName("createTime", metaObject);
        Object modifyTime = getFieldValByName("modifyTime", metaObject);
        if (null == createTime) {
            setFieldValByName("createTime", new Date(), metaObject);
        }
        if (null == modifyTime) {
            setFieldValByName("modifyTime", new Date(), metaObject);
        }
        if (null == creator) {
            setFieldValByName("creator", "SYSTEM", metaObject);
        }
        if (null == modifier) {
            setFieldValByName("modifier", "SYSTEM", metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Object modifyTime = getFieldValByName("modifyTime", metaObject);
        if (null == modifyTime) {
            setFieldValByName("modifyTime", new Date(), metaObject);
        }
    }
}