package lesson2;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeGeneration {
    public static void main (String[] args) {
        String [] generationArray = {
                "Greatest",
                "Silent",
                "Baby Boomers",
                "Generation X",
                "Millennials (Gen Y)",
                "Generation Z (Gen Z)",
                "Generation Alpha"};
        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name:");
            String name = scanner.nextLine();

            System.out.println("Enter your age:");
            int age = scanner.nextInt();


            int yearOfBirth = LocalDate.now().getYear() - age;
            String generation = "Unknown";

            if (yearOfBirth <= 1924 && yearOfBirth >= 1901) {
                generation = generationArray[0];
            } else if (yearOfBirth >= 1925 && yearOfBirth <= 1945) {
                generation = generationArray[1];
            } else if (yearOfBirth >= 1946 && yearOfBirth <= 1964) {
                generation = generationArray[2];
            } else if (yearOfBirth >= 1965 && yearOfBirth <= 1980) {
                generation = generationArray[3];
            } else if (yearOfBirth >= 1981 && yearOfBirth <= 1996) {
                generation = generationArray[4];
            } else if (yearOfBirth >= 1997 && yearOfBirth <= 2012) {
                generation = generationArray[5];
            } else if (yearOfBirth >= 2013 && yearOfBirth <= 2025) {
                generation = generationArray[6];
            }
                System.out.println("Hi, " + name + ", you belong to " + generation + " generation.");
                System.out.println("--------------------------");
             }
        }
    }

