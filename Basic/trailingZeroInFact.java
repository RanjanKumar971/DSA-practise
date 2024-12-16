public class trailingZeroInFact {
    // public static int fact(int n) {
    // int f = 1;
    // for(int i=2;i<=n;i++)
    // f*=i;
    // return f;
    // }

    // public static int countzero(int n) {
    // n = fact(n);
    // int c = 0;

    // while (n % 10 == 0) {
    // c++;
    // n /= 10;

    // }
    // return c;
    // }

    public static void main(String[] args) {
        System.out.println(countzero(100));
    }

    public static int countzero(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5)
            res += n / i;
        return res;

    }
}
