package Bitwise;

public class MaxConsecutive1 {
    public static int maxConsecutiveOnes(int n) {
        int c = 0, c1 = 0;
        while (n != 0) {
            int p1, p2;
            p1 = n & 1;
            p2 = (n >> 1) & 1;
            if (p1 == 1) {
                if (p1 == p2)
                    c++;
            } else {
                if (c1 < c)
                    c1 = c;

                c = 0;
            }
            n = n >> 1;

        }
        if (c1 > c)
            return ++c1;
        return ++c;

    }

}
