package Array2;

public class TrappingRainWater {
    public static int waterAmount(int a[]) {
        int res = 0, n = a.length;
        int lmax[] = new int[a.length], rmax[] = new int[a.length];
        lmax[0] = a[0];
        for (int i = 1; i < a.length; i++)
            lmax[i] = Math.max(lmax[i - 1], a[i]);
        rmax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rmax[i] = Math.max(rmax[i + 1], a[i]);
        for (int i = 1; i < a.length; i++)
            res += (Math.min(lmax[i], rmax[i]) - a[i]);
        return res;
    }

    public static void main(String[] args) {
        int a[] = { 2, 0, 2 };
        System.out.println(waterAmount(a));
    }

    // public static int waterAmount(int a[]) {
    // int res = 0;
    // for (int i = 1; i < a.length - 1; i++) {
    // int lmax = a[i];
    // for (int j = 0; j < i; j++)
    // lmax = Math.max(lmax, a[j]);
    // int rmax = a[i];
    // for (int j = i + 1; j < a.length; j++)
    // rmax = Math.max(rmax, a[j]);
    // res += (Math.min(lmax, rmax) - a[i]);
    // }
    // return res;
    // }
}
