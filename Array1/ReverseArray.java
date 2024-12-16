package Array1;

public class ReverseArray {
    public static int[] rev(int a[], int n) {
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = { 30, 7, 6, 5, 10 };
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        a = rev(a, a.length);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

}
