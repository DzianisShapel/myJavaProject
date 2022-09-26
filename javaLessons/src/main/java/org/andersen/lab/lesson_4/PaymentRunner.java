package org.andersen.lab.lesson_4;

public class PaymentRunner {

    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("Milk", 5);
        payment.addProduct("Bred", 4);
        payment.addProduct("Potatoes", 10);

        payment.showProducts();
        System.out.println("Overall payment: " + payment.getPaymentAmount());
    }
}
