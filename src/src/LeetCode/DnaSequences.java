package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class DnaSequences {
    public static List<String> findRepeatedDnaSequences(String s) {

        List<String> l = new ArrayList<>();
        System.out.println("len " + s.length());

        for (int i = 0; i < s.length() + 9; i += 9) {
            l.add(s.substring(i, i + 9));
        }

        return l;
    }

    public static void main(String[] args) {
        List<String> ans = findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");

        System.out.println(ans);
    }
}
