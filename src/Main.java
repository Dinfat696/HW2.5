import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }

        }
    }


    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                set.add(num);
            }
        }
                System.out.println(set);


            }


    public static void task3() {
        List<String> str = new ArrayList<>(List.of("qwe", "qwe", "rty", "qwe", "fgh", "sdf"));
        Set<String> st = new HashSet<>(str);
        System.out.println(st);
    }


    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string, 1);
            } else {
                map.put(string, map.get(string) + 1);
            }
        }
        System.out.println(map.values());
    }
}









