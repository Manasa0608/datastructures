package LeetCode;

import java.util.*;

public class KDiffPairs {
    public static int findPairs(int[] nums, int k) {
        Map<List, Integer> m = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (nums[j] - nums[i] == k && j != i) {
                    List<Integer> l = new ArrayList<>();
                    l.add((nums[j]));
                    l.add(nums[i]);
                    Collections.sort(l);
                    if (!m.containsKey(l)) {
                        m.put(l, 1);
                        count++;
                    }
                }
            }
        }


        return count;

    }

    public static void main(String[] args) {
        System.out.println("ans is " + findPairs(new int[]{-1,-2,-3}, 1));
    }
}
