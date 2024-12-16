package Array1;

public class LargestAndSecondLargest {
    public static int maxIndex(int a[]) {
        int idx = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[idx]) {
                idx = i;
            }
        }
        return idx;
    }

    public static int sMaxIndex(int a[]) {
        int max = 0, smax = -1;
        if (a.length < 2)
            return -1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[max]) {
                smax = max;
                max = i;
            } else if (a[i] != a[max]) {
                if (smax == -1 || a[i] > a[smax])
                    smax = i;
            }
        }

        return smax;
    }

    public static void main(String[] args) {

        int a[] = { 20, 10, 20, 8, 12 };
        System.out.println(maxIndex(a));
        System.out.println(sMaxIndex(a));

    }
}
