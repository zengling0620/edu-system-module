package com.edu.model;

import com.edu.enums.ResultCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 平台通用返回结果 <br>
 * @date: 2020/4/10 8:50 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlatformResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public static PlatformResult success() {
        PlatformResult result = new PlatformResult();
        result.setResultCode(ResultCodeEnum.SUCCESS);
        return result;
    }

    public static PlatformResult success(Object data) {
        PlatformResult result = new PlatformResult();
        result.setResultCode(ResultCodeEnum.SUCCESS);
        result.setData(data);
        return result;
    }

    public static PlatformResult failure(ResultCodeEnum resultEnum) {
        PlatformResult result = new PlatformResult();
        result.setResultCode(resultEnum);
        return result;
    }

    public static PlatformResult failure(ResultCodeEnum resultEnum, Object data) {
        PlatformResult result = new PlatformResult();
        result.setResultCode(resultEnum);
        result.setData(data);
        return result;
    }

    public static PlatformResult failure(Integer code, String message) {
        PlatformResult result = new PlatformResult();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    private void setResultCode(ResultCodeEnum resultEnum) {
        this.code = resultEnum.code();
        this.message = resultEnum.desc();
    }
}
