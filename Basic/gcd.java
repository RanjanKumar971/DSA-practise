public class gcd {
    public static int findgcd(int a, int b) {
        if (b == 0)
            return a;
        return findgcd(b, a % b);
    }

    // public static int findgcd(int a, int b) {
    // int res = Math.min(a, b);
    // while (res > 1) {
    // if (a % res == 0 && b % res == 0)
    // break;
    // res--;
    // }
    // return res;
    // }

    // public static int findgcd(int a, int b) {
    // while (a != b) {
    // if (a > b)
    // a = a - b;
    // else
    // b -= a;
    // }
    // return a;
    // }

    public static void main(String[] args) {
        System.err.println(findgcd(8, 12));
    }
}
