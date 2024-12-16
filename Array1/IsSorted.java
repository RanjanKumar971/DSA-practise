package Array1;

public class IsSorted {
    public static boolean isSorted(int a[], int n) {
        for (int i = 0; i < n - 1; i++)
            if (a[i] > a[i + 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        int a[] = { 7, 20, 30, 10 };
        System.out.println(isSorted(a, a.length));
    }

}
