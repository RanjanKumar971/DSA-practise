public class factorial {
    // public static int fact(int n) {
    // if (n == 0)
    // return 1;
    // return n * fact(n - 1);
    // }

    public static int fact(int n) {
        int f = 1;
        while (n != 0) {
            f *= n;
            n -= 1;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}
