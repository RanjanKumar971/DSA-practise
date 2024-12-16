package Recursive;

public class SumOfSubSet {
    public static int count(int a[], int n, int sum) {

        if (n == 0)
            return (sum == 0) ? 1 : 0;
        return count(a, n - 1, sum) + count(a, n - 1, sum - a[n - 1]);

    }

    public static void main(String[] args) {
        int a[] = { 10, 15, 25 };
        System.out.println(count(a, a.length, 25));
    }

}
