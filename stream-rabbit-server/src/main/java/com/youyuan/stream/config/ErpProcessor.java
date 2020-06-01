package com.youyuan.stream.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * 类名称：ErpProcessor <br>
 * 类描述：Rabbit队列配置类 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/1 19:39<br>
 */
public interface ErpProcessor {
    String INPUT = "erpInput";
    String OUTPUT = "erpOutPut";

    /**
    * 方法名:  erpInput <br>
    * 方法描述: 消息消费管道 <br>
    *
    * @return {@link }
    * @date 创建时间: 2020/6/1 19:40 <br>
    * @author zhangyu
    */
    @Input(INPUT)
    SubscribableChannel erpInput();

    /**
    * 方法名:  erpOutPut <br>
    * 方法描述: 消息生产管道 <br>
    *
    * @return {@link }
    * @date 创建时间: 2020/6/1 19:41 <br>
    * @author zhangyu
    */
    @Output(OUTPUT)
    MessageChannel erpOutPut();
}
