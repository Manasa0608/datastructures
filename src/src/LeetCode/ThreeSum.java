package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    static HashMap<List, Integer> map = new HashMap<>();
    static List<List<Integer>> l = new ArrayList<List<Integer>>();

    public static void threeSum(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int temp = i;
            recur(i,nums[i], nums);
        }

        System.out.println("Map " + map);


        System.out.println("arralist"+l);

    }

    private static void recur(int i1, int i, int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (j == i1 || k == i1) {
                    break;
                }
                if (i+ nums[j] + nums[k] == 0) {
                    List<Integer> a = new ArrayList<>();
                    a.add(i);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    Collections.sort(a);
                    if (map.containsKey(a)) {
                        break;
                    } else {
                        map.put(a, 1);
                        l.add(a);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
       threeSum(new int[]{0,0});
    }

}
