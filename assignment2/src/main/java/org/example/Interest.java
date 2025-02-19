package org.example;

public abstract class Interest {
    protected float Principal;
    protected float Rate;
    protected float Period;

    @Override
    public String toString() {
        return "Principal: " + Principal + "\n Rate: " + Rate + "\n Period: " + Period;
    }

    protected Interest(float principal, float rate, float period) {
        this.Principal = principal;
        this.Rate = rate;
        this.Period = period;
    }

    protected Interest() {
        this.Principal = 0;
        this.Rate = 0;
        this.Period = 0;
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