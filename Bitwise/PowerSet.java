package Bitwise;

public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        printPowerSet(s);
    }

    public static void printPowerSet(String s) {
        int n = s.length();
        int powSize = (int) Math.pow(2, n);
        for (int counter = 0; counter < powSize; counter++) {
            for (int j = 0; j < n; j++)
                if ((counter & (1 << j)) != 0)
                    System.out.print(s.charAt(j));
            System.out.println();
        }

    }
}
