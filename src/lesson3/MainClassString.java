package lesson3;

public class MainClassString {
    public static void main(String[] args) {
        String line = "test";

        System.out.println(line.length());
        System.out.println(line.toUpperCase());
        String newLine = line.toUpperCase();
        System.out.println(newLine);
        System.out.println("-------");
        System.out.println(line.substring(2, 4));
        System.out.println("-------");
        String line2 = " Test 2 ";
        System.out.println("'" + line2.trim() + "'"); //убрать пробелы
        String line3 = new String( "test");
        if (line.equals(line3)){
            System.out.println("Eq");
        }else{
            System.out.println("Not eq");
        }
        System.out.println();

        String line4 = "test;test1;test2";
        String[] massiveString = line4.split(";");
        System.out.println(massiveString[1]);
        System.out.println(line4.replace(";", ","));
        System.out.println(line4.split(";")[2].toUpperCase().substring(0,5));
    }
}
