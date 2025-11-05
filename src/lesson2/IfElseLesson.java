package lesson2;

import java.util.Scanner;

public class IfElseLesson {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // combinations
        // logical AND &&
        // logical OR ||
        // by-bit comparison &

        while(true) {
            int x = scanner.nextInt();
            if (x == 3) {
                System.out.println("Value is equal to 3");
            } else {
                System.out.println("Value is not 3");
            }
        }
    }
}
