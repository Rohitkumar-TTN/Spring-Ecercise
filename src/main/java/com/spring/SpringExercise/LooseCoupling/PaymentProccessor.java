package com.spring.SpringExercise.LooseCoupling;

public class PaymentProccessor {
    private PaymentService paymentService;
    public PaymentProccessor(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void processPayment(int amount){
        paymentService.pay(amount);
    }
}
