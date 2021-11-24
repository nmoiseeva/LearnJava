package lesson3HW4;

public class WorkWithMassive {

    public int[][] createMassive(int countLine, int countColumn, int numberForMassive) {
        if (countLine <0){
            countLine=countLine*(-1);
            System.out.println("Massive side can`t be negative value");
        }
        if (countColumn <0){
            countColumn=countColumn*(-1);
            System.out.println("Massive side can`t be negative value");
        }
        int[][] massive = new int[countLine][countColumn];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = numberForMassive;
            }
        }
        printMatrix(massive);
        return massive;
    }

    private boolean isMatrixNotSquare(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                System.out.println("Matritsa ne kvadratnaya");
                return true;
            }
        }
        return false;
    }

    public int[][] fillingOfLeftDiagonal(int[][] massive, int numberForMassive) {
        //Check that matrix is square
        if (isMatrixNotSquare(massive)) {
            return massive;
        } else if (massive.length == 0) {
            System.out.println("Your matrix is empty!");
            return new int[][]{{numberForMassive}};
        }
        for (int i = 0; i < massive.length; i++) {
            massive[i][i] = numberForMassive;
       }
        System.out.println("Filling of matrix`s left diagonal successful!");
        printMatrix(massive);
        return massive;
    }


    public int[][] fillingOfRightDiagonal(int[][] massive, int numberForMassive) {
        //Check that matrix is square
        if (isMatrixNotSquare(massive)) {
            return massive;
        } else if (massive.length == 0) {
            System.out.println("Your matrix is empty!");
            return new int[][]{{numberForMassive}};
        }
        for (int i = 0; i < massive.length; i++) {
            massive[i][i] = numberForMassive;
            for (int j = 0; j < massive[i].length; j++) {
                massive[j][massive[j].length - 1 - j] = numberForMassive;
            }
        }
        System.out.println("Filling of matrix`s right diagonal successful!");
        printMatrix(massive);
        return massive;
    }


    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
