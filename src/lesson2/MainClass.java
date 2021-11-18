package lesson2;

public class MainClass {

    public static void main(String[] args) {
        Calc2 calc2 = new Calc2();
        calc2.sumDouble(5, 10);
        calc2.sumDouble(5, " 11Test");
        System.out.println("");

        calc2.sumDouble("11", 5);
        System.out.println(calc2.sumDouble("11q", 5));
        System.out.println("");

        int[] massive = {11, 5, 10, 0};
        System.out.println(massive);
        System.out.println(massive[2]);
        System.out.println(massive.length);
        System.out.println();

        int[] massive2 = new int[3];
        massive2[0] = 21;
        massive2[1] = 36;
        massive2[2] = 8;
        System.out.println(massive2[1]);
        System.out.println();

        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
        System.out.println();

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] >5) {
                System.out.println("On position # " + (i + 1) + " number " + massive[i]);
            } else if (massive[i] == 5) {
                System.out.println("= 5");
            } else {
                System.out.println(massive[i] + " element is less than 5");
            }
        }


        System.out.println();
        System.out.println("--- The end ---");

    }


}
