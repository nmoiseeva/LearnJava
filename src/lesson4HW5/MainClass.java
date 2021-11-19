package lesson4HW5;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(22);
        arrayInteger.add(33);
        arrayInteger.add(66);
        arrayInteger.add(44);

        int min = arrayInteger.get(0);
        int max = arrayInteger.get(arrayInteger.size()-1);
        for (Integer i : arrayInteger){
            if (i<min) min = i;
            if (i>max) max = i;
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);

        List<Integer> arrayList = new ArrayList<>();
        for (int i = arrayInteger.size()-1; i >= 0; i--) {
            arrayList.add(arrayInteger.get(i));
        }
        System.out.println(arrayList);

    }

}
