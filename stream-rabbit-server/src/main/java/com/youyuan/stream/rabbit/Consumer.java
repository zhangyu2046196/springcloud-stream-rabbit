package com.youyuan.stream.rabbit;

import com.youyuan.stream.config.ErpProcessor;
import com.youyuan.stream.dto.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * 类名称：Consumer <br>
 * 类描述：消费者 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/1 19:43<br>
 */
@Component
@Slf4j
public class Consumer {

    /**
     * 方法名:  receive <br>
     * 方法描述: 消费消息 <br>
     *
     * @return {@link }
     * @date 创建时间: 2020/6/1 19:44 <br>
     * @author zhangyu
     */
    @StreamListener(ErpProcessor.INPUT)
    public void receive(MessageDto messageDto) {
        log.info("消费者接收到的消息是:" + messageDto);
    }
}
