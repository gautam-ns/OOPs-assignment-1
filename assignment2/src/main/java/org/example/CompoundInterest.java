package org.example;

public class CompoundInterest extends Interest {

    public CompoundInterest(float principal, float rate, float period) {
        super(principal, rate, period);
    }

    public float getFinalAmount() {
        return (float) ( principal * Math.pow(1 + rate, period));
    }
}
