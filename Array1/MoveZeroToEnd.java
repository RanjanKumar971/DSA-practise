package Array1;

public class MoveZeroToEnd {
    public static int move(int a[]) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[c];
                a[c] = a[i];
                a[i] = temp;
                c++;

            }
        }
        return c;
    }

    public static void main(String[] args) {
        int a[] = { 1, 0, 2, 3, 0, 0, 5 };
        int n = move(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }

}
