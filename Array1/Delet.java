package Array1;

public class Delet {
    public static int[] delect(int a[], int ele) {
        int a2[] = new int[a.length - 1];
        int i = 0;
        for (i = 0; i < a.length; i++) {
            a2[i] = a[i];
            if (a[i] == ele) {

                break;
            }

        }
        if (i != -1) {
            for (; i < a.length - 1; i++)
                a2[i] = a[i + 1];
        }

        return a2;
    }

    public static void main(String[] args) {
        int a[] = { 3, 8, 12, 5, 6 };
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        a = delect(a, 12);
        System.out.println();
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        a = delect(a, 8);
        System.out.println();
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}