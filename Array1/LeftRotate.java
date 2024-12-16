package Array1;

public class LeftRotate {
    public static void leftRotate(int a[], int k) {
        int b[] = new int[a.length];
        for (int i = 0; i < k; i++) {
            b[i] = a[i];
        }
        for (int i = k; i < a.length; i++) {
            a[i] = b[(i + k) % a.length];
        }
        for (int i = 0; i < k; i++) {
            a[a.length - k + i] = b[i];
        }
    }

    public static void main(String[] args) {
        int a[] = { 3, 5, 7 };
        leftRotate(a, 3);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

}
