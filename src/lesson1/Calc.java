package lesson1;

public class Calc {

    public static void sum(int dodanok1, int dodanok2){
        int tempResult = dodanok1+dodanok2;
        System.out.println("Result from method sum() = " + tempResult);
    }

    public String sum(String dodanok1, String dodanok2){
        String tempResult = dodanok1 + dodanok2;
        System.out.println("Sum strings = " + tempResult);
        return tempResult;
    }

    public int mult(int mnognyk1, int mnognyk2){
        int tempResult= mnognyk1*mnognyk2;
        System.out.println("Dobutok = " + tempResult);
        return tempResult;
    }

}
