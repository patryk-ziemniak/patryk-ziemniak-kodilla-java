package com.kodilla.good.patterns.challenges.food2door.sender;

public class EmailSender implements InformationSender {

    @Override
    public void send(String contact) {
        System.out.println("Sending email confirmation to supplier's email: " + contact);
    }
}
