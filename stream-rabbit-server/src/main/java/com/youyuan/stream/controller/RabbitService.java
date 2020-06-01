package com.youyuan.stream.controller;

import com.youyuan.stream.rabbit.Consumer;
import com.youyuan.stream.rabbit.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：RabbitService <br>
 * 类描述： rabbit对外工具 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/1 19:53<br>
 */
@RestController
public class RabbitService {

    @Autowired
    private Producer producer;

    @GetMapping("/producer")
    public void send() {
        producer.send();
    }
}
