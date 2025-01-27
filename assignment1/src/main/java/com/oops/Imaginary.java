package com.oops;

public class Imaginary {
    private double imaginary;

    public Imaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double setImaginary(double imaginary) {
        return this.imaginary = imaginary;
    }

    public void add(double imaginary) {
        this.imaginary = this.imaginary + imaginary;
    }

    public void subtract(double imaginary) {
        this.imaginary = this.imaginary - imaginary;
    }

    public void multiply(double imaginary) {
        this.imaginary = this.imaginary * imaginary;
    }

    public void divide(double imaginary) {

        //exception handling
        if (imaginary == 0.0) {
            throw new ArithmeticException("/ by zero");
        }
        this.imaginary = this.imaginary / imaginary;
    }

}
