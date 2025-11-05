package lesson6;

import java.util.Scanner;

public class SeaBattleMatrix {


    private static int[] getValidCoordinate(Scanner scanner, int [][] matrix) {
        int x;
        int y;
        while (true) {
            System.out.println("Enter coordinate in format x,y. For example \"1,2\"");
            String xyString = scanner.next();
            String[] stringArray = xyString.split(",");
            x = Integer.parseInt(stringArray[0]);
            y = Integer.parseInt(stringArray[1]);
            if (matrix[x][y] != 0) {
                System.out.println("This cell is already taken. Please select another one.");
            } else {
                break;
            }
        }

        return new int[]{x, y};
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print("X" + "  ");
                } else {
                    System.out.print("-" + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Scanner scanner = new Scanner(System.in);
        int numberOf4CellShips = 1;
        int numberOf3CellShips = 2;
        int numberOf2CellShips = 3;
        int numberOf1CellShips = 4;

        System.out.println("Enter the 1 ship with 4 cells: ");
        for (int i = 0; i < numberOf4CellShips * 4; i++) {
            int[] xyCoordinates = getValidCoordinate(scanner, matrix);
            int x = xyCoordinates[0];
            int y = xyCoordinates[1];
            matrix[x][y] = 1;
        }
        printMatrix(matrix);

        System.out.println("Enter the 2 ships with 3 cells: ");
        for (int i = 0; i < numberOf3CellShips * 3; i++) {
            int[] xyCoordinates = getValidCoordinate(scanner, matrix);
            int x = xyCoordinates[0];
            int y = xyCoordinates[1];
            matrix[x][y] = 1;
        }
        printMatrix(matrix);

        System.out.println("Enter the 3 ships with 2 cells: ");
        for (int i = 0; i < numberOf2CellShips * 2; i++) {
            int[] xyCoordinates = getValidCoordinate(scanner, matrix);
            int x = xyCoordinates[0];
            int y = xyCoordinates[1];
            matrix[x][y] = 1;
        }
        printMatrix(matrix);

        System.out.println("Enter the 4 ships with 1 cells: ");
        for (int i = 0; i < numberOf1CellShips * 1; i++) {
            int[] xyCoordinates = getValidCoordinate(scanner, matrix);
            int x = xyCoordinates[0];
            int y = xyCoordinates[1];
            matrix[x][y] = 1;
        }
        printMatrix(matrix);
    }
}
