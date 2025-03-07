package com.example;
import java.util.Scanner;


public class BMIRechner {

    public static void main(String[] args) {

        System.out.println("Guten Tag");

        System.out.println("Bitte geben Sie Ihr Alter ein.");
        int age = new Scanner(System.in).nextInt();

        if (age <= 20) {
            System.out.println("Dieser BMI-Rechner ist leider nur für Erwachsene ab 21 Jahren geeignet.");
        } else {

        System.out.println("Bitte geben Sie Ihr Gewicht in Kg ein.");
        float userWeight = new Scanner(System.in).nextFloat();

        System.out.println("Bitte geben Sie Ihre Größe in Metern ein.");
        float userHeight = new Scanner(System.in).nextFloat();

            // BMI = m/l²

            double bmi = userWeight / Math.pow(userHeight, 2);
            System.out.printf("Ihr Body-Mass-Index beträgt " + "%.2f%n", bmi);


            if (bmi < 18.5) {
                System.out.println("Sie haben Untergewicht.");
            }
            if ((bmi >= 18.5) && (bmi < 25)) {
                System.out.println("Sie haben Normalgewicht.");
            }
            if (bmi >= 25) {
                System.out.println("Sie haben Übergewicht.");
            }
        }
    }

}
