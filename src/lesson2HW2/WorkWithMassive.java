package lesson2HW2;

public class WorkWithMassive {

    void analyzeMassive (int[] massive, int var)
    {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > var) {
                System.out.println("On position # " + (i + 1) + " number '" + massive[i] + "'");
            } else if (massive[i] == var) {
                System.out.println("On position # " + (i + 1) +" element = '" + var + "'");
            } else {
                System.out.println("On position # " + (i + 1) +" is '" +massive[i] + "', element is less than " + var);
            }
        }
    }
}
