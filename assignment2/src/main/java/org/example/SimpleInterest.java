package org.example;

public class SimpleInterest extends Interest {

    public SimpleInterest(float principal, float rate, int period) {
        super(principal, rate, period);
    }


    public double getFinalAmount() {
        return Principal + (Principal * Rate * Period)/100;
    }
}
