package Bitwise;

public class TwoOddInArray {
    public static void findOdd(int a[]) {
        int xor = 0, res1 = 0, res2 = 0;
        for (int i = 0; i < a.length; i++)
            xor = xor ^ a[i];
        int sb = xor & ~(xor - 1);
        for (int i = 0; i < a.length; i++) {
            if ((a[i] & sb) != 0)
                res1 = res1 ^ a[i];
            else
                res2 = res2 ^ a[i];
        }
        System.out.println(res1 + " " + res2);
    }

    public static void main(String[] args) {

        int a[] = { 3, 4, 5, 5 };
        findOdd(a);
    }
}
