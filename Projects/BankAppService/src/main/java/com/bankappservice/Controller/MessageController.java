package com.bankappservice.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankappservice.Service.MessageProducer;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageProducer messageProducer;

    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam String destination, @RequestParam String message) {
        messageProducer.sendMessage(destination, message);
        return ResponseEntity.ok("Message sent to " + destination);
    }
}
