package lesson3HW4;

public class WorkWithMassive {

    public int[][] createMassive(int countLine, int countColumn, int numberForMassive) {
        int[][] massive = new int[countLine][countColumn];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                massive[i][j] = numberForMassive;
            }
        }
        return massive;
    }

    public int[][] fillingOfLeftDiagonal(int[][] massive, int numberForMassive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive.length == massive[i].length) {
                for (int j = 0; j < massive[i].length; j++) {
                    for (int k = 0; k < massive[j].length; k++) {
                        massive[i][i] = numberForMassive;
                    }
                }
            } else {
                System.out.println("Matritsa ne kvadratnaya");
                break;
            }
        }
        return massive;
    }

    public int[][] fillingOfRightDiagonal(int[][] massive, int numberForMassive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive.length == massive[i].length) {
                for (int j = 0; j < massive[i].length; j++) {
                    for (int k = 0; k < massive[j].length; k++) {
                        massive[j][massive[j].length - 1 - j] = numberForMassive;
                    }
                }
            } else {
                System.out.println("Matritsa ne kvadratnaya");
                break;
            }
        }
        return massive;
    }

}
