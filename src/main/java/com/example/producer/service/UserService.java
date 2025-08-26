package com.example.producer.service;

import com.example.producer.User;
import com.example.producer.entity.UserInformation;
import com.example.producer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private KafkaTemplate<String, Object> template;

    private String topic = "javatechie17";

    public void userSave(UserInformation userInformation){
        userRepository.save(userInformation);
    }
    public String publishMessage(UserInformation userInformation) {
        template.send(topic, userInformation);
        return "Json Data published";
    }
}
