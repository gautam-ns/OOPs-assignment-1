package com.oops;

public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {

        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {

        return real;
    }

    public double getImaginary() {

        return imaginary;
    }

    public void setReal(double real) {

        this.real = real;
    }

    public void setImaginary(double imaginary) {

        this.imaginary = imaginary;
    }

    public double getMagnitude() {

        return Math.sqrt(this.getReal() * this.getReal() + this.getImaginary() * this.getImaginary());
    }

    public void add(Complex c) {

        this.real = this.getReal() + c.getReal();
        this.imaginary = this.getImaginary() + c.getImaginary();
    }

    public void subtract(Complex c) {

        this.real = this.getReal() - c.getReal();
        this.imaginary = this.getImaginary() - c.getImaginary();
    }

    public void multiply(Complex c) {

        double real = this.getReal() * c.getReal() - this.getImaginary() * c.getImaginary();
        double imaginary = this.getReal() * c.getImaginary() + this.getImaginary() * c.getReal();

        this.real = real;
        this.imaginary = imaginary;
    }

    public void divide(Complex c) {

        double denominator = c.getReal() * c.getReal() + c.getImaginary() * c.getImaginary();
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        double real = (this.getReal() * c.getReal() + this.getImaginary() * c.getImaginary()) / denominator;
        double imaginary = (this.getImaginary() * c.getReal() - this.getReal() * c.getImaginary()) / denominator;

        this.setReal(real);
        this.setImaginary(imaginary);
    }

    public void print() {

        System.out.println(this.getReal() + " + " + this.getImaginary() + "i");
    }
}