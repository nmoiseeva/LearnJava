package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<String> ourList = new ArrayList();
        System.out.println(ourList);
        ourList.add("Test");
        System.out.println(ourList);
        ourList.add("Test2");
        ourList.add("Test3");
        System.out.println(ourList);
        System.out.println(ourList.size());
        System.out.println(ourList.get(1));
        System.out.println();

        ourList.add(2,"test");
        System.out.println(ourList);
        System.out.println(ourList.get(2));
        ourList.remove(0);
        System.out.println(ourList);

        for (int i = 0; i < ourList.size(); i++) {
            System.out.println(i+ "-"+ourList.get(i));
        }
        System.out.println();

        for(String element : ourList){
            System.out.println(" -" + element);
        }
        System.out.println();

        ArrayList<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(22);
        arrayInteger.add(33);
        arrayInteger.add(66);
        arrayInteger.add(44);
        System.out.println(arrayInteger);
        System.out.println(Collections.max(arrayInteger));
        Collections.sort(arrayInteger);
        System.out.println(arrayInteger);
        Collections.reverse(arrayInteger);
        System.out.println(arrayInteger);


    }
}
