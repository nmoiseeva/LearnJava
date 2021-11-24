package lesson3HW4;

public class MainClass {

    public static void main(String[] args) {
        WorkWithMassive workWithMassive = new WorkWithMassive();
        int[][] newMassive = workWithMassive.createMassive(3,3,8);
        workWithMassive.printMatrix(newMassive);
        System.out.println();
        int [][] newMassiveL = workWithMassive.fillingOfLeftDiagonal(newMassive,1);
        workWithMassive.printMatrix(newMassiveL);
        System.out.println();
        int[][] newMassiveRightDiagonal =  workWithMassive.fillingOfRightDiagonal(newMassive,1);
        workWithMassive.printMatrix(newMassiveRightDiagonal);

    }


}
