package com.spring.SpringExercise.LooseCoupling;

public class StripePayement implements PaymentService{
    public void pay(int amount){
        System.out.println(amount);
    }
}
