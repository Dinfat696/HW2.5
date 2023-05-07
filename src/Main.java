import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }

        }
        System.out.println();

        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>(nums1);
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);


            }
        }
        System.out.println();

        List<String> str = new ArrayList<>(List.of("qwe", "qwe", "rty", "qwe", "fgh", "sdf"));
        Set<String> st = new HashSet<>(str);
        System.out.println(st);
        System.out.println();

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









