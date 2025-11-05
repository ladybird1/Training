package lesson2;

import java.util.Scanner;

public class NumberDetector {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number:");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Foo");
            } else {
                System.out.println("Bar");
            }
            System.out.println("--------------------------");
        }
    }
}
