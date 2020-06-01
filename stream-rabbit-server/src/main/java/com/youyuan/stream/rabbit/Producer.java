package com.youyuan.stream.rabbit;

import com.youyuan.stream.config.ErpProcessor;
import com.youyuan.stream.dto.MessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * 类名称：Producer <br>
 * 类描述：生产者 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2020/6/1 19:45<br>
 */
@Component
@Slf4j
public class Producer {

    @Autowired
    private ErpProcessor erpProcessor;

    public void send() {
        for (int i = 1; i <= 50; i++) {
            MessageDto messageDto = new MessageDto("姓名" + i, i + 10);
            log.info("生产者发送消息为:" + messageDto);
            Message<MessageDto> stringMessage = MessageBuilder.withPayload(messageDto).build();
            erpProcessor.erpOutPut().send(stringMessage);
        }
    }
}
