package com.spring.SpringExercise.LooseCouplingUsingSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageProvider {
    @Autowired
    @Qualifier("smsMessage")
    private NotificationService notificationService;
    private String message;
    public MessageProvider(NotificationService notificationService){
        this.notificationService=notificationService;
    }
   public void giveMessage(String message){
       this.message=message;
   }
   public void getMessage(){
        notificationService.sendMessage(message);
   }
}
