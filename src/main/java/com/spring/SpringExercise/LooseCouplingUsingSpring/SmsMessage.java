package com.spring.SpringExercise.LooseCouplingUsingSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsMessage")
//@Primary
public class SmsMessage implements NotificationService{
    public void sendMessage(String message){
        System.out.println("Message sending using the sms "+message);
    }
}
