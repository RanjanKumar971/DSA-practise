package Bitwise;

public class CountBitFlip {
    public static int countBitsFlip(int a, int b) {
        int c = 0;
        while (a != b) {
            if (!(((a & 1) == (b & 1)))) {
                c++;
                a = a ^ 1;

            }
            a = a >> 1;
            b = b >> 1;

        }
        return c;

    }

}
