package Bitwise;

public class BinaryGreyConvert {
    static String binToGrey(String B) {
        String ans = String.valueOf(B.charAt(0));

        for (int i = 1; i < B.length(); i++) {
            char c = B.charAt(i);
            char d = B.charAt(i - 1);
            int x = (Character.getNumericValue(c)) ^ (Character.getNumericValue(d));
            ans += x;
        }
        return ans;
    }

    static String greyToBin(String G) {
        String BinaryCode = "";
        BinaryCode += G.charAt(0);
        for (int i = 1; i < G.length(); i++) {

            BinaryCode += (G.charAt(i) ^ BinaryCode.charAt(i - 1));

        }
        return BinaryCode;
    }

    public static void main(String[] args) {
        System.out.println(binToGrey("01001"));
        System.out.println(greyToBin("01101"));
    }

}
