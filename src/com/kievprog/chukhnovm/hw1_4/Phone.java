package com.kievprog.chukhnovm.hw1_4;

public class Phone {

    private String number;
    private Network network;

    public Phone() {
    }

    public Phone(String number, Network network) {
        this.number = number;
        this.network = network;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void registerNumber() {
        if (this.getNetwork() != null) {
            this.getNetwork().setNumber(this.getNumber());
        }
    }

    public void call(String number) {

        if (this.getNumber() == null) {
            System.out.println(" XXX Phone number undefined.");
            return;
        }

        if (this.getNetwork() == null) {
            System.out.println(" XXX Phone network undefined.");
            return;
        }

        System.out.printf("Calling from: %s to: %s", this.getNumber(), number);

        if (!this.getNetwork().isNumberExists(number)) {
            System.out.println(" ==X Not exists!");
            return;
        }

        if (this.getNumber().equals(number)) {
            System.out.println(" X== You trying call on your own telephone number.");
            return;
        }

        System.out.println(" ==> Succeed :)");
    }
}
