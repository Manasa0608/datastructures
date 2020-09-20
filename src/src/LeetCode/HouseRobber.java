package LeetCode;

public class HouseRobber {
    public static int rob(int[] nums) {

        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);

        // dp[i] represent the maximum value stolen
        // so far after reaching house i.
        int[] dp = new int[n];

        // Initialize the dp[0] and dp[1]
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // Fill remaining positions
        for (int i = 2; i<n; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            System.out.println(i+" is  "+dp[i]);
        }


        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println("ans must be 20");
        System.out.println("ans is          "+rob(new int[]{1,20,4,50,6,70,900}));
    }
}
