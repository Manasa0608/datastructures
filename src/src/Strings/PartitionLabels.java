package Strings;

import java.util.ArrayList;
import java.util.List;

//split the string into partition such that a letter is present only in one partition
/*
    Eg: "abcdefhgfemnponm" split into "abc" "defhgfe" "mnponm"
    @returns a list of length of partitions [3, 7, 6]
 */
public class PartitionLabels {

    public static void main(String[] args) {
        String S = "ababcadefgedeijkjhikji";
        System.out.println("Output should be :\n[6, 7, 9]");
        System.out.println("Output is :\n" + partitionString(S));
    }

    public static List<Integer> partitionString(String s) {
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < s.length(); i = max + 1) {
            max = s.lastIndexOf(s.charAt(i));

            //finds if a char that exists within the max range is present beyond max and updates max value
            for (int j = i + 1; j < max; j++) {
                int temp1 = s.lastIndexOf(s.charAt(j));
                if (temp1 > max) {
                    max = temp1;
                }
            }
            ans.add(max + 1 - i);
        }
        return ans;
    }
}

//
//    List<Integer> ans = new ArrayList<Integer>();
//        if(S.length() == 0){
//                return ans;
//                }
//                char[] arr = S.toCharArray();
//                HashSet<Character> seen = new HashSet<Character>();
//        int[] right = new int[26];
//        for(char c:arr)
//        right[c-'a']++;
//        int count =0;
//        for(char c:arr){
//        System.out.println("char "+c);
//        count++;
//        System.out.println("count "+count);
//        seen.add(c);
//        System.out.println("seen "+seen);
//        if(--right[c-'a'] == 0){
//        System.out.println("loop "+right[c-'a']);
//        seen.remove(c);
//        if(seen.isEmpty()){
//        System.out.println("empty "+seen);
//        ans.add(count);
//        System.out.println("count "+count+"  ans "+ans);
//        count=0;
//        }
//        }
//        }
//        return ans;
//        }