package lesson3;

import lesson3HW4.WorkWithMassive;

public class MainClass {
    public static void main(String[] args) {
        // 1  2  3
        // 4  5  6
        // 7  8  9
        // 10 11
        int[][] massiveMassive = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11}};
        System.out.println(massiveMassive[1][2]);
        System.out.println(massiveMassive.length);

        for (int i = 0; i < massiveMassive.length; i++) {
            for (int j = 0; j < massiveMassive[i].length; j++) {
                System.out.print(massiveMassive[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] massiveMassive2 = new int[3][4]; // 3 строки по 4 єлемента
        for (int i = 0; i < massiveMassive2.length; i++) {
            for (int j = 0; j < massiveMassive2[i].length; j++) {
                massiveMassive2[i][j] = 1 ;
            }
        }
        printMatrix(massiveMassive2);
        System.out.println();


    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }



}
