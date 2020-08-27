package com.kievprog.chukhnovm.hw1_4;

import java.util.ArrayList;

public class Network {

    private ArrayList<String> numbers = new ArrayList<>();

    public ArrayList<String> getNumbers() {
        return numbers;
    }

    public Network() {
    }

    public void setNumbers(String[] numbers) {
        for (String number : numbers) {
            this.setNumber(number);
        }
    }

    public void setNumber(String number) {
        if (number.length() > 0 && !this.isNumberExists(number)) {
            this.getNumbers().add(number);
        }
    }

    public boolean isNumberExists(String number) {
        return this.getNumbers() != null && this.getNumbers().contains(number);
    }
}
