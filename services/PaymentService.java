package services;
import models.Payment;
public class PaymentService {
    public void processPayment(Payment payment) {
        System.out.println("Payment processed: " + payment);
    }
}
