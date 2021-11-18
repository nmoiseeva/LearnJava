package lesson3HW4;

public class MainClass {

    public static void main(String[] args) {
        WorkWithMassive workWithMassive = new WorkWithMassive();
        int[][] newMassive = workWithMassive.createMassive(3,3,8);
        printMatrix(newMassive);
        System.out.println();
        int[][] newMassiveLeftDiagonal =  workWithMassive.fillingOfLeftDiagonal(newMassive,1);
        printMatrix(newMassiveLeftDiagonal);
        System.out.println();
        int[][] newMassiveRightDiagonal =  workWithMassive.fillingOfRightDiagonal(newMassive,1);
        printMatrix(newMassiveRightDiagonal);
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
