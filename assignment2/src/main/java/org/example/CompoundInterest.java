package org.example;

public class CompoundInterest extends Interest {

    public CompoundInterest(float principal, float rate, int period) {
        super(principal, rate, period);
    }

    public double getFinalAmount() {
        return Principal * Math.pow(1 + Rate, Period);
    }
}
