package lesson3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiDimentionalArrays {

    // |1,2,3|
    // |4,5,6|
    // |7,8,9|

    // Одновимірний масив - це список даних

    public static void main(String[] args) {
        // 1 variant - definition and asisgnment at the same time
        int [][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        // 2 variant - only definition
        int [][] matrix2 = new int[3][3];

        // cubic array - currently don't mind it
        int [][][] cubicArray = {{{},{},{}}, {}, {}};


        // working with multi-dimentional arrays
        matrix2[0][1] = 5;
        matrix2[2][0] = 1;


        printMatrix(matrix2);

        System.out.println("============================");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the matrix");
        int size = scanner.nextInt();

        int [][] matrix3 = new int[size][size];
        int totalElements = size*size;


        for (int i = 0; i <totalElements; i++) {
            System.out.println("Enter X:");
            int x = scanner.nextInt();
            System.out.println("Enter Y:");
            int y = scanner.nextInt();
            System.out.println("Enter value:");
            int value = scanner.nextInt();
            matrix3[x][y] = value;
        }

        printMatrix(matrix3);

//        int [][] matrix4 = new int[size][size];
//        for (int i = 0; i < matrix4.length; i++) {
//            for (int j = 0; j < matrix4[i].length; j++) {
//                System.out.println("Enter element:");
//                int element = scanner.nextInt();
//                matrix4[i][j] = element;
//            }
//        }
//
//        printMatrix(matrix4);

    }

    public static void printMatrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
