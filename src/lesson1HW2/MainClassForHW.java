package lesson1HW2;

public class MainClassForHW {
    public static void main(String[] args) {
        int chysloInt = 10;
        double chysloDouble = 5.2;

        Calculator calculator = new Calculator();
        int result=(calculator.vidnimannya(chysloInt,6));
        System.out.println("Rezultat vidnimannya 'int': "+  result);
        calculator.vidnimannya(9.21,chysloDouble);
    }
}
