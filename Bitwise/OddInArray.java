package Bitwise;

public class OddInArray {
    public static int findOdd(int a[]) {
        int res = 0;
        for (int i = 0; i < a.length; i++)
            res = res ^ a[i];
        return res;
    }

    public static void main(String[] args) {
        int a[] = { 4, 3, 4, 4, 4, 5, 5, 3, 3 };
        System.out.println(findOdd(a));
    }
}
