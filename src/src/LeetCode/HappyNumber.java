package LeetCode;

public class HappyNumber {

    public static boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        if(n < 10 ){
            return false;
        }
        if(split(n) == 1){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("13 " + isHappy(13));
    }

    public static int split(int n) {
        int rev  = 0;
        while (n != 0) {
            int temp = n % 10;
            n = n / 10;
            rev += (temp * temp);
        }
        if (rev > 10) {
           return split(rev);
        }
        if(rev ==10){
            return 1;
        }
        return rev;
    }

}
