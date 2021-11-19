package lesson4;

import java.util.ArrayList;

public class MainClassListList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ourListList = new ArrayList<>();
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);
        ourListList.get(0).add("Test");
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        ourListList.get(1).add("Test2");
        System.out.println(ourListList);
        ourListList.get(0).add("Test3");
        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        ourListList.add(new ArrayList<>());
        ourListList.get(3).add("Test4");
        System.out.println(ourListList);
        System.out.println("Size = " + ourListList.size());
        System.out.println("Size line 0 = " + ourListList.get(0).size());
        System.out.println(ourListList.get(0).get(1));
        System.out.println();

        ArrayList<String> newList = new ArrayList<>();
        newList.add("newList1");
        newList.add("newList2");
        System.out.println(newList);

        ourListList.add(newList);
        System.out.println(ourListList);

        newList.add("newList3");
        System.out.println(newList);
        System.out.println(ourListList);
        System.out.println();

        ourListList.add(new ArrayList<>());
        ourListList.get(5).addAll(newList);
        System.out.println(ourListList);
        newList.remove(0);
        System.out.println(newList);
        System.out.println(ourListList);
    }

}
