package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Map<String, String> ourMap = new HashMap<>();
        ourMap.put("login", "test");
        System.out.println(ourMap);
        ourMap.put("pass", "123");
        System.out.println(ourMap);
        System.out.println(ourMap.get("login"));
        ourMap.remove("login");
        System.out.println(ourMap);
        System.out.println();

        // login | pass |
        // test1 | 123  |
        // test2 | 234  |

        ArrayList<HashMap<String, String>> table = new ArrayList<>();

        HashMap<String,String> line1 = new HashMap<>();
        line1.put("login","test1");
        line1.put("pass", "123");
        table.add(line1);

        HashMap<String,String> line2 = new HashMap<>();
        line2.put("login","test2");
        line2.put("pass", "234");
        table.add(line2);

        System.out.println(table);
        System.out.println(table.get(1).get("pass"));


    }
}
