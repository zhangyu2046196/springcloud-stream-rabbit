package com.youyuan.stream.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 类名称：MessageDto <br>
 * 类描述：消息传输dto <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/1 19:42<br>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto implements Serializable {
    private static final long serialVersionUID = -3175295899538697112L;

    /**
     * 用户名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
}
