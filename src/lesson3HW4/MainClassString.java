package lesson3HW4;

public class MainClassString {
    public static void main(String[] args) {
        String testString = " Test_String ";

        System.out.println("'"+testString.trim()+"'");

        System.out.println("'"+testString.substring(1,5)+"'");

        if (testString.trim().startsWith("t")) {
            System.out.println("First symbol - «Т»");
        }else if(testString.trim().startsWith("T")) {
            System.out.println("First symbol - «Т»");
        }

        System.out.println(testString.replaceFirst("s", "y"));

    }
}
