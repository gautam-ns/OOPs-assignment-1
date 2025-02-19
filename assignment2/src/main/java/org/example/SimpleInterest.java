package org.example;

public class SimpleInterest extends Interest {

    public SimpleInterest(float principal, float rate, float period) {
        super(principal, rate, period);
    }

    public float getFinalAmount() {
        return (float) (Principal + (Principal * Rate * Period)/100);
    }
}
