package com.oops;

public class Complex {

    private Real real;
    private Imaginary imaginary;

    public Complex(double real, double imaginary) {
        this.real = new Real(real);
        this.imaginary = new Imaginary(imaginary);
    }

    public double getReal() {
        return real.getReal();
    }

    public double getImaginary() {
        return imaginary.getImaginary();
    }

    public double setReal(double real) {
        return this.real.setReal(real);
    }

    public double setImaginary(double imaginary) {
        return this.imaginary.setImaginary(imaginary);
    }

    public double getMagnitude() {
        return Math.sqrt(real.getReal() * real.getReal() + imaginary.getImaginary() * imaginary.getImaginary());
    }

    public void add(Complex c) {

        this.real.add(c.getReal());
        this.imaginary.add(c.getImaginary());
    }

    public void subtract(Complex c) {

        this.real.subtract(c.getReal());
        this.imaginary.subtract(c.getImaginary());
    }

    public void multiply(Complex c) {

        double real = this.real.getReal() * c.getReal() - this.imaginary.getImaginary() * c.getImaginary();
        double imaginary = this.real.getReal() * c.getImaginary() + this.imaginary.getImaginary() * c.getReal();
        this.real.setReal(real);
        this.imaginary.setImaginary(imaginary);
    }

    public void divide(Complex c) {
        double denominator = c.getReal() * c.getReal() + c.getImaginary() * c.getImaginary();
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        double realPart = (this.real.getReal() * c.getReal() + this.imaginary.getImaginary() * c.getImaginary()) / denominator;
        double imaginaryPart = (this.imaginary.getImaginary() * c.getReal() - this.real.getReal() * c.getImaginary()) / denominator;

        this.real.setReal(realPart);
        this.imaginary.setImaginary(imaginaryPart);
    }


    public void print() {

        System.out.println(real.getReal() + " + " + imaginary.getImaginary() + "i");
    }
}