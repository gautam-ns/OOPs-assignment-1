package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input in the form of principal, rate, period and type of compound interest: ");

        String input = sc.nextLine();

        Pattern pattern  =  Pattern.compile("(\\d+) (\\d+) (\\d+) (\\w)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {

            float principal = Float.parseFloat(matcher.group(1));
            float rate = Float.parseFloat(matcher.group(2));
            int period = Integer.parseInt(matcher.group(3));
            char type =Character.toUpperCase(matcher.group(4).charAt(0));
            if (type == 'S') {

                SimpleInterest simpleInterest = new SimpleInterest(principal, rate, period);
                System.out.println(simpleInterest);
                System.out.println("Final amount: " + String.format("%.2f", simpleInterest.getFinalAmount()));
            } else if (type == 'C') {

                CompoundInterest compoundInterest = new CompoundInterest(principal, rate, period);
                System.out.println(compoundInterest);
                System.out.println("Final amount: " + String.format("%.2f", compoundInterest.getFinalAmount()));
            }
        } else {
            System.out.println("Invalid input");
        }
}}
