package Bitwise;

public class countBIt {

    // public static int countBit(int n) {
    // int c = 0;
    // while (n != 0) {
    // n = n & (n - 1);
    // c++;

    // }
    // return c;
    // }

    public static void main(String[] args) {
        System.out.println(countBits(513));
    }

    static int[] table = new int[256];

    static void initialize() {
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    public static int countBits(int n) {
        initialize();
        int res = table[n & 0xff];

        n = n >> 8;
        res += table[n & 0xff];
        n = n >> 8;
        res += table[n & 0xff];
        n = n >> 8;
        res += table[n & 0xff];
        return res;
    }
}
