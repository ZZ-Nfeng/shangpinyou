package com.zhi.spy.mq.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Component
public class RabbitService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //发送消息的方法
    //exchange交换机
    //routingKey路由
    //message消息
    public boolean sendMessage(String exchange,String routingKey,Object message) {
        rabbitTemplate.convertAndSend(exchange,routingKey,message);
        return true;
    }

}
