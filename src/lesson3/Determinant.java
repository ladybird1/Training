package lesson3;

import java.util.Scanner;

public class Determinant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        while(size != 2 && size != 3) {
            System.out.println("Enter the size of the matrix 2 or 3: ");
            size = scanner.nextInt();
        }

            int[][] matrix = new int[size][size];
            int totalElements = size * size;

        for (int i = 0; i <totalElements; i++) {
            System.out.println("Enter X:");
            int x = scanner.nextInt();
            System.out.println("Enter Y:");
            int y = scanner.nextInt();
            System.out.println("Enter value:");
            int value = scanner.nextInt();
            matrix[x][y] = value;
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();

        }
        if (size == 2) {
            int a = matrix[0][0];
            int b = matrix[0][1];
            int c = matrix[1][0];
            int d = matrix[1][1];
            int determinant = a * d - b * c;
            System.out.println("The determinant is: " + determinant);
        }
        if (size == 3){
            int a = matrix[0][0];
            int b = matrix[0][1];
            int c = matrix[0][2];
            int d = matrix[1][0];
            int e = matrix[1][1];
            int f = matrix[1][2];
            int g = matrix[2][0];
            int h = matrix[2][1];
            int i = matrix[2][2];
            int determinant3 = a * e * i + b * f * g + c * d * h - c * e * g - b * d * i - a * f * h;
            System.out.println("The determinant is: " + determinant3);
        }
    }
}
