package com.edu.exception;

import com.edu.StringUtil;
import com.edu.enums.BusinessExceptionEnum;
import com.edu.enums.ResultCodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: BusinessException <br>
 * @date: 2020/1/9 12:36 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
@Data
public class BusinessException extends RuntimeException implements Serializable {
    protected Integer code;
    protected String message;
    protected ResultCodeEnum resultCodeEnum;
    protected Object data;

    public BusinessException() {
        BusinessExceptionEnum exceptionEnum = BusinessExceptionEnum.getByEClass(this.getClass());
        if (exceptionEnum != null) {
            resultCodeEnum = exceptionEnum.getResultCode();
            code = exceptionEnum.getResultCode().code();
            message = exceptionEnum.getResultCode().desc();
        }
    }

    public BusinessException(String message) {
        this();
        this.message = message;
    }

    public BusinessException(String format, Object... objects) {
        this();
        this.message = StringUtil.formatIfArgs(format, "{}", objects);
    }

    public BusinessException(ResultCodeEnum resultCode, Object data) {
        this(resultCode);
        this.data = data;
    }

    public BusinessException(ResultCodeEnum resultCodeEnum) {
        this.resultCodeEnum = resultCodeEnum;
        this.code = resultCodeEnum.code();
        this.message = resultCodeEnum.desc();
    }
}
