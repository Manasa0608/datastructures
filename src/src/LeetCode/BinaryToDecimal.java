package LeetCode;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "0011";
        int len = binary.length() - 1;
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, len);
            }
            len--;

        }

        System.out.println("Decimal of " + binary + " is " + decimal);
    }
}
