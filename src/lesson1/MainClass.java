package lesson1;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello!");
        int var;
        var = 5;
        int var2 = 10;
        int result = var+var2;
        System.out.println(result);
        System.out.println("Result = " + (result + var));

        Calc.sum(var,var2);
        Calc.sum(result,var);

        Calc calc = new Calc();
        int result1 = calc.mult(var, var2);
        int result2 = calc.mult(2,var2);
        calc.mult(2, result2);
        calc.sum(calc.sum("test"," pass"), " !!!");
    }


}
