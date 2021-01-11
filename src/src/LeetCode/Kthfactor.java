package LeetCode;

import java.util.ArrayList;

public class Kthfactor {
    public static void main(String[] args) {
        System.out.println(kthFactor(1000,3));
    }

    public static int kthFactor(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }

        if(k <= arr.size()){
            return arr.get(k-1);
        }else{
            return -1;
        }
    }
}
