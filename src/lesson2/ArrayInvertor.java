package lesson2;

import java.util.Scanner;

public class ArrayInvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();

        int [] sizeArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            sizeArray[i] = scanner.nextInt();
        }

        System.out.println("Your reversed array is:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(sizeArray[i] + " ");
            }
    }
}
