package com.tomtop.zhizi.datacenter.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
//@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {

        System.out.println("Receiver : " + hello);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}