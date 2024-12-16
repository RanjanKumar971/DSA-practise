package Array1;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int a[], int n) {

        int res = 1;

        for (int i = 1; i < n; i++) {
            if (a[res - 1] != a[i]) {
                a[res] = a[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++)
            a[i] = a[i];
        return res;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 3, 4, 4 };
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        int res = removeDuplicates(a, a.length);
        System.out.println("\n" + res);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }

}
