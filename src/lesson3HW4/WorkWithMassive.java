package lesson3HW4;

public class WorkWithMassive {
    /**
     *
     * @param countLine к-во строк в матрице
     * @param countColumn к-во столбцов в матрице
     * @param numberForMassive число которым будет заполнена матрица
     * @return созданная матрица
     */
    public int[][] createMassive(int countLine, int countColumn, int numberForMassive) {
        int[][] massive = new int[countLine][countColumn];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = numberForMassive;
            }
        }
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
        }
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                for (int k = 0; k < massive[j].length; k++) {
                    massive[i][i] = numberForMassive;
                }
            }
        }
        System.out.println("Filling of matrix`s left diagonal successful!");
        return massive;
    }


    public int[][] fillingOfRightDiagonal(int[][] massive, int numberForMassive) {
        //Check that matrix is square
        if (isMatrixNotSquare(massive)) {
            return massive;
        }
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                for (int k = 0; k < massive[j].length; k++) {
                    massive[j][massive[j].length - 1 - j] = numberForMassive;
                }
            }
        }
        System.out.println("Filling of matrix`s right diagonal successful!");
        return massive;
    }


    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
