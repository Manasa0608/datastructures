package Strings;

//algo to detect if a string is made up of similar substring Eg: abcabc is made of abc 2 times
/*
    @returns a Boolean value
 */
public class RepeatedString {

    public static void main(String[] args) {
        String s = "abcabcabcabc";
        if ((s + s).indexOf(s, 1) != s.length()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
