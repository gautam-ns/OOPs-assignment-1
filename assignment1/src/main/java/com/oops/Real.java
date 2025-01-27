package com.oops;

public class Real {
    private double real;

    public Real(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public double setReal(double real) {
        return this.real = real;
    }

    public void add(double real) {
        this.real = this.real + real;
    }

    public void subtract(double real) {
        this.real = this.real - real;
    }

    public void multiply(double real) {
        this.real = this.real * real;
    }

    public void divide(double real) {

        if (real == 0.0) {
            throw new ArithmeticException("/ by zero");
        }
        this.real = this.real / real;
    }
}
