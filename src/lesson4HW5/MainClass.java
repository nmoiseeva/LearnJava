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

        Integer maxNumber = findMaxNumber(arrayInteger);
        System.out.println("Maximum = " + maxNumber);

        List<Integer> arrayList = new ArrayList<>();
        for (int i = arrayInteger.size()-1; i >= 0; i--) {
            arrayList.add(arrayInteger.get(i));
        }
        System.out.println(arrayList);
    }

    public static Integer findMaxNumber (ArrayList<Integer> list){
        Integer max = list.get(0);
        for (Integer i : list){
            if (i>max) max = i;
        }
        return max;
    }
}
