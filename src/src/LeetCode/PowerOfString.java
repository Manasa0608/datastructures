package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerOfString {
    public static int maxPower(String s) {
        s = s.toLowerCase();
        char prev = s.charAt(0);

        List<Integer> power = new ArrayList<>();

        int j = 0;
        boolean flag = false;

        for (int i = 1; i < s.length(); i++) {
            if (prev == s.charAt(i)) {
                power.add(j,power.get(j)+1);
                flag = true;
            } else {
                j++;
            }
            prev = s.charAt(i);
        }

        Collections.sort(power);

        if (flag == false) {
            return 1;
        }
        return power.get(power.size()) + 1;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("leetco"));
    }
}
