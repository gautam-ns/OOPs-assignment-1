package com.oops;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;

        while (!exit) {

            System.out.println("Enter the real part of the first complex number: ");
            double real1 = Double.parseDouble(System.console().readLine());

            System.out.println("Enter the imaginary part of the first complex number: ");
            double imaginary1 = Double.parseDouble(System.console().readLine());

            System.out.println("The first complex number is: ");
            Complex c1 = new Complex(real1, imaginary1);
            c1.print();

            System.out.println("Enter the real part of the second complex number: ");
            double real2 = Double.parseDouble(System.console().readLine());

            System.out.println("Enter the imaginary part of the second complex number: ");
            double imaginary2 = Double.parseDouble(System.console().readLine());

            System.out.println("The second complex number is: ");
            Complex c2 = new Complex(real2, imaginary2);
            c2.print();

            System.out.println("Enter operation: ");
            String operation = System.console().readLine();

            switch (operation) {
                case "+":
                    c1.add(c2);
                    break;
                case "-":
                    c1.subtract(c2);
                    break;
                case "*":
                    c1.multiply(c2);
                    break;
                case "/":
                    c1.divide(c2);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.print("Result:");
            c1.print();

            System.out.println("Would you like to perform another operation? (y/n)");
            String answer = System.console().readLine();

            if (answer.equals("y")) {
                continue;
            } else {
                exit = true;
            }
        }
    }
}