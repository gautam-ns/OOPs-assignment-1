package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input in the form of principal, rate, period and type of interest: ");

        String input = sc.nextLine();

        Pattern pattern  =  Pattern.compile("(\\d+) (\\d+) (\\d+) (\\w)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {

            float principal = Float.parseFloat(matcher.group(1));
            float rate = Float.parseFloat(matcher.group(2));
            int period = Integer.parseInt(matcher.group(3));
            char type =Character.toUpperCase(matcher.group(4).charAt(0));

            Interest interest = Interest.createInterest(principal, rate, period, type);
            if(interest == null) {
                System.out.println("Invalid type of interest");
                return;
            }
            System.out.println(interest);
            System.out.println("Final amount: " + String.format("%.2f", interest.getFinalAmount()));
        } else {
            System.out.println("Invalid input");
        }
}}
