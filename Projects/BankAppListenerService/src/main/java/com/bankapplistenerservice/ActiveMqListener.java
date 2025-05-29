package com.bankapplistenerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqListener {
    private final MessageRepository messageRepository;

    @Autowired
    public ActiveMqListener(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @JmsListener(destination = "myDestination")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
        messageRepository.save(new MessageEntity(message));
    }
}

