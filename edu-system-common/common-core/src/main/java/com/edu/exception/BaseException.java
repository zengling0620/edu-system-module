package com.edu.exception;

import java.io.Serializable;

/**
 * @description: BaseException <br>
 * @date: 2020/1/9 12:33 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
public class BaseException extends RuntimeException implements Serializable {
    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
}