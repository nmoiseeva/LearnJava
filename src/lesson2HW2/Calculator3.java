package lesson2HW2;

public class Calculator3 {

    public int division(int chyslo1, int chyslo2) {
        try {
            int tempResult = chyslo1 / chyslo2;
            System.out.println("Division result = " + tempResult);
            return tempResult;
        } catch (ArithmeticException e) {
            System.out.println("Error 1: na 0 delit zapresheno! Message: " + e.getMessage());
            return 88888;
        } catch (Exception e) {
            System.out.println("Error 2 : " + e);
            return 99999;
        }
    }

    public double division(double chyslo1, double chyslo2) {
        try {
            double tempResult = chyslo1 / chyslo2;
            System.out.println("Division result = " + tempResult);
            return tempResult;
        } catch (Exception e) {
            System.out.println("Error 1 : " + e);
            return 99999;
        }
    }
}
