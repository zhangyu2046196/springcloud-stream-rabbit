package com.youyuan.stream;

import com.youyuan.stream.config.ErpProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * 类名称：RabbitStreamApp <br>
 * 类描述：主启动类 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/1 19:38<br>
 */
@SpringBootApplication
@EnableBinding(value = {ErpProcessor.class})
public class RabbitStreamApp {

    public static void main(String[] args) {
        SpringApplication.run(RabbitStreamApp.class, args);
    }

}
