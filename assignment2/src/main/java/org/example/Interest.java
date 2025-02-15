package org.example;

public class Interest {
    protected double Principal;
    protected double Rate;
    protected double Period;

    @Override
    public String toString() {
        return "Principal: " + Principal + "\n Rate: " + Rate + "\n Period: " + Period;
    }

    public Interest(double principal, double rate, int period) {
        this.Principal = principal;
        this.Rate = rate;
        this.Period = period;
    }

    public Interest() {
        this.Principal = 0;
        this.Rate = 0;
        this.Period = 0;
    }

}