package LeetCode;

import java.util.HashMap;

public class BullsandCows {

    public static String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;

            } else {
                if (map.containsKey(secret.charAt(i))) {
                    int freq = map.get(secret.charAt(i));
                    freq++;
                    map.put(secret.charAt(i), freq);
                } else {
                    map.put(secret.charAt(i), 1);
                }
            }
        }

        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);

            if (c1 != c2) {
                if (map.containsKey(c2)) {
                    b++;
                    if (map.get(c2) == 1) {
                        map.remove(c2);
                    } else {
                        int freq = map.get(c2);
                        freq--;
                        map.put(c2, freq);
                    }
                }
            }
        }

        return String.valueOf(a) + "A" + String.valueOf(b) + "B";
    }

    public static void main(String[] args) {
        System.out.println("expected " + "1A3B");
        System.out.println("getting  " + getHint("1807", "7810"));
    }

}
