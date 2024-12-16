package Recursive;

public class RopeCutting {
    public static int maxCut(int l, int a, int b, int c) {
        if (l == 0)
            return 0;
        if (l < Math.min(a, Math.min(c, b)))
            return -1;
        int res1 = maxCut(l - a, a, b, c);
        int res2 = maxCut(l - b, a, b, c);
        int res3 = maxCut(l - c, a, b, c);
        int res = Math.max(res1, Math.max(res2, res3));
        if (res == -1)
            return -1;
        return res + 1;
    }

    public static void main(String[] args) {
        System.out.println(maxCut(5, 2, 5, 1));
    }
}
