package com.edu.exception;

import java.io.Serializable;

/**
 * @description: ConversionException <br>
 * @date: 2020/1/9 12:44 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
public class ConversionException extends RuntimeException implements Serializable {

    public ConversionException(String message) {
        super(message);
    }
}
