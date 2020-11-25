package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIntervals {
    public static int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]);
        for(int[] i :intervals){
            System.out.println(i[0]+" "+i[1]);
        }
        List<int[]> merged = new ArrayList<>();
        int[] curr = null;
        for (int[] interval : intervals) {
            if (curr == null) {
                curr = interval;
                continue;
            }

            if (interval[1] > curr[1]) {
                merged.add(curr);
                curr = interval;
            }
        }
        merged.add(curr);

        return merged.size();
    }

    public static void main(String[] args) {
        System.out.println(removeCoveredIntervals(new int[][]{{1, 4}, {5, 6}}));
    }
}
