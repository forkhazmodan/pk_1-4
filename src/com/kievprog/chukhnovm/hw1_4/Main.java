package com.kievprog.chukhnovm.hw1_4;

public class Main {
    public static void main(String[] args) {

        String[] phoneNumbers = {
            "+380931111111",
            "+380932222222",
            "+380933333333",
            "+380934444444",
            "+380935555555",
        };

        Network network = new Network();

        for (String phoneNumber : phoneNumbers) {

            Phone phone = new Phone(phoneNumber, network);
            phone.registerNumber();

            for (String phoneNumberTest : phoneNumbers) {
                phone.call(phoneNumberTest);
            }

            System.out.println();
        }
    }
}
