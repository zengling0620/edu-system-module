package com.edu.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 * @description: API 统一返回状态码
 * @date: 2020/4/10 8:58 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ResultCodeEnum {
    //成功
    SUCCESS(200, "响应成功"),
    // 错误
    ERROR(500, "响应失败"),

    /*参数错误：10001-19999*/
    PARAM_IS_INVALID(10001, "参数无效"),
    PARAM_IS_BLANK(10002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(10003, "参数类型错误"),
    PARAM_NOT_COMPLETE(10004, "参数缺失"),

    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),

    /* 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "内部系统接口调用异常"),

    ;



    private Integer code;
    private String desc;

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    public String getFormatDesc(String... params) {
        return String.format(this.getDesc(), params);
    }

}
