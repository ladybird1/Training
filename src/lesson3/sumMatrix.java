package lesson3;

public class sumMatrix {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        int[][] sumMatrix = new int[2][2];

        for (int r = 0; r < matrixA.length; r++) {
            for (int c = 0; c < matrixA[r].length; c++) {
                sumMatrix[r][c] = matrixA[r][c] + matrixB[r][c];
            }


            for (int i = 0; i < sumMatrix.length; i++) {
                for (int j = 0; j < sumMatrix[i].length; j++) {
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

