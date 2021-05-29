package com.coffeeandcode.amqp.consumerapi;

import com.coffeeandcode.amqp.producerapi.Machine;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MachineConsumer {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @RabbitListener(queues = MachineAMQPConfig.QUEUE)
    public void consumer(Machine machine) {
        simpMessagingTemplate.convertAndSend(MachineWebSocketConfiguration.BROKER,
                machine);
    }
}
