package LeetCode;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println("Expected output : abccdcdcdxyz");
        System.out.println("Returned output : " + decodeString("abc3[cd]xyz"));
    }

    public static String decodeString(String s) {
        String str = "";
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int pos = s.indexOf('[', i);
                int num = Integer.parseInt(s.substring(i, pos));
                i = pos - 1;
                numStack.push(num);
            } else if (ch == ']') {
                String s1 = "";
                while (charStack.peek() != '[') {
                    s1 = charStack.pop() + s1;
                }
                charStack.pop();
                int num = numStack.pop();
                String s2 = "";
                for (int j = 0; j < num; j++) {
                    s2 += s1;
                }
                for (int j = 0; j < s2.length(); j++) {
                    charStack.push(s2.charAt(j));
                }
            } else
                charStack.push(ch);
        }
        while (!charStack.isEmpty())
            str = charStack.pop() + str;
        return str;
    }
}
