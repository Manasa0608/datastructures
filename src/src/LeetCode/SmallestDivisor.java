package LeetCode;

public class SmallestDivisor {
    public static int smallestDivisor(int[] nums, int threshold) {
        float divisor = 1f;
        float answer = 0f;
        while(divisor < threshold){
            int temp = 0;
            for(int i = 0; i < nums.length; i++){
                temp += (nums[i]/divisor);
            }
            if(temp <= threshold){
                return ((int) divisor);
            }
            divisor++;
        }
        return (int)divisor;
    }

    public static void main(String[] args) {
        System.out.println(smallestDivisor(new int[]{1,2,5,9},6 ));
    }
}
