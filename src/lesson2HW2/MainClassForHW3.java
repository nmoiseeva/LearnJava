package lesson2HW2;

public class MainClassForHW3 {
    public static void main(String[] args) {
        int[] massive = {12,5,-3,45,0,10};
        double chyslo = 545466.5;

        Calculator3 calculator3 = new Calculator3();
        calculator3.division(2,2);
        calculator3.division(chyslo,8);
        System.out.println();

        WorkWithMassive workWithMassive = new WorkWithMassive();
        workWithMassive.analyzeMassive(massive,10);
    }
}
