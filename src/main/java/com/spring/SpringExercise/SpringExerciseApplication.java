package com.spring.SpringExercise;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.spring.SpringExercise.LooseCoupling.PaymentProccessor;
import com.spring.SpringExercise.LooseCoupling.PaypalPayment;
import com.spring.SpringExercise.LooseCoupling.StripePayement;
import com.spring.SpringExercise.LooseCouplingUsingSpring.MessageProvider;
import com.spring.SpringExercise.TightCoupling.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExerciseApplication {

	public static void main(String[] args) {


//   Tight coupling Q1
		BinarySearch binarySearch = new BinarySearch();
// Loose Coupling Q2
		PaypalPayment paypalPayment = new PaypalPayment();
		StripePayement stripePayement = new StripePayement();
		PaymentProccessor paymentProccessor = new PaymentProccessor(paypalPayment);
         paymentProccessor.processPayment(100);
		PaymentProccessor paymentProccessor2 = new PaymentProccessor(stripePayement);
		paymentProccessor2.processPayment(200);
  //Q3 to Q6 in Package LooseCouplingUsingSpring
		ApplicationContext context=SpringApplication.run(SpringExerciseApplication.class, args);
		MessageProvider messageProvider = context.getBean(MessageProvider.class);
         messageProvider.giveMessage("rohit");
		 messageProvider.getMessage();


	}
}