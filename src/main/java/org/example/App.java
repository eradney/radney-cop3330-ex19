/**
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        double height, weight, bmi;

        System.out.print("What is your height in inches? ");
        height = scnr.nextDouble();
        System.out.print("What is your weight in pounds? ");
        weight = scnr.nextDouble();

        bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.1f.\n", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are within the ideal weight range.");
        }
        else {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
