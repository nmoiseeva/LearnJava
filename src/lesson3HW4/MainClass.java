package lesson3HW4;

public class MainClass {

    public static void main(String[] args) {
        WorkWithMassive workWithMassive = new WorkWithMassive();
        int[][] newMassive = workWithMassive.createMassive(-3,3,8);
        System.out.println();
        workWithMassive.fillingOfLeftDiagonal(newMassive,1);
        System.out.println();
        workWithMassive.fillingOfRightDiagonal(newMassive,5);
        System.out.println();
        workWithMassive.fillingOfTwoDiagonals(newMassive,5);
    }


}
