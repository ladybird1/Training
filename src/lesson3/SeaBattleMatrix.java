package lesson3;

import java.util.Scanner;

public class SeaBattleMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the 1 ship with 4 cells: ");
        for (int i = 0; i <4; i++) {
            System.out.println("Enter X:");
            int x = scanner.nextInt();
            System.out.println("Enter Y:");
            int y = scanner.nextInt();
            matrix [x][y] = 1;
        }

        System.out.println("Enter the 2 ships with 3 cells: ");
        for (int i = 0; i <6; i++) {
            System.out.println("Enter X:");
            int x = scanner.nextInt();
            System.out.println("Enter Y:");
            int y = scanner.nextInt();
            matrix[x][y] = 1;
        }

        System.out.println("Enter the 3 ships with 2 cells: ");
        for (int i = 0; i <6; i++) {
            System.out.println("Enter X:");
            int x = scanner.nextInt();
            System.out.println("Enter Y:");
            int y = scanner.nextInt();
            matrix[x][y] = 1;
        }

        System.out.println("Enter the 4 ships with 1 cells: ");
        for (int i = 0; i <4; i++) {
            System.out.println("Enter X:");
            int x = scanner.nextInt();
            System.out.println("Enter Y:");
            int y = scanner.nextInt();
            matrix[x][y] = 1;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
