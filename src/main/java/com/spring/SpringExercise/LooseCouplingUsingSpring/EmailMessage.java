package com.spring.SpringExercise.LooseCouplingUsingSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailMessage implements NotificationService{
    public void sendMessage(String message){
        System.out.println("Message Sending using email"+message);
    }
}
