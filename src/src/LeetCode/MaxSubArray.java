package LeetCode;

public class MaxSubArray {
    public static int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]>0){

           }

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("expected  " + 12);
        System.out.println("recieved " + maxProduct(new int[]{-2,0, -3}));
    }
}
