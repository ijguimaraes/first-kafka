package com.zuera.firstkafka;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaResource {

    @Autowired
    private Producer producer;

    @GetMapping("/test")
    public String test() {
        return "OK!";
    }

    @GetMapping("/produce")
    public ResponseEntity<?> toProduce() {
        producer.sendMessage("My First Kafka!");
        return ResponseEntity.ok().build();
    }
}
