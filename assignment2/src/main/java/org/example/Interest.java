package org.example;

public abstract class Interest {
    protected float principal;
    protected float rate;
    protected float period;

    @Override
    public String toString() {
        return "Principal: " + principal + "\n Rate: " + rate + "\n Period: " + period;
    }

    protected Interest(float principal, float rate, float period) {
        this.principal = principal;
        this.rate = rate;
        this.period = period;
    }

    protected Interest() {
        this.principal = 0;
        this.rate = 0;
        this.period = 0;
    }

    public static Interest createInterest(float principal, float rate, float period, char type) {
        if (type == 'S') {
            return new SimpleInterest(principal, rate, period);
        } else if (type == 'C') {
            return new CompoundInterest(principal, rate, period);
        }else {
            return null;
        }

    }

    public abstract float getFinalAmount();

}