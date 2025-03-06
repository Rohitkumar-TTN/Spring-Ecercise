package com.spring.SpringExercise.LooseCoupling;

public class PaypalPayment implements PaymentService{
    public void pay(int amount){
        System.out.println(amount);
    }
}
