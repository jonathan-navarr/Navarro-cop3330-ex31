package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class KarvonenHeartRate {
    public static void main(String[] args) {

        int restingHR, age;
        Scanner scnr = new Scanner(System.in);
        System.out.print("What is your resting heart rate? ");
        restingHR = scnr.nextInt();
        System.out.print("What is your age? ");
        age = scnr.nextInt();

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        int intensity = 55;
        System.out.println("Intensity \t | Rate ");
        System.out.println("-------------|-----------");

        while (intensity < 96) {
            int TargetHeartRate = (((220 - age) - restingHR) * intensity/100) + restingHR;
            System.out.println(intensity + "% \t \t | " + TargetHeartRate + "bpm");
            intensity += 5;
        }
    }
}