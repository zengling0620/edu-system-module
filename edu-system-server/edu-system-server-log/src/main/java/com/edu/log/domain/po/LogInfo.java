package com.edu.log.domain.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.edu.po.BasePo;
import lombok.Data;

/**
 * @description: LogInfo <br>
 * @date: 2020/4/27 10:12 <br>
 * @author: 86173 <br>
 * @version: 1.0 <br>
 */
@Data
public class LogInfo extends BasePo {
    @TableField(value = "message_id")
    private String messageId;
}
