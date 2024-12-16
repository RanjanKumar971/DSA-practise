public class lcm {
    public static int findLcm(int a, int b) {
        return a * b / findgcd(a, b);
    }

    public static int findgcd(int a, int b) {
        if (b == 0)
            return a;
        return findgcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(findLcm(8, 12));
    }

    // public static int findgcd(int a, int b) {
    // int res = Math.max(a, b);
    // while (true) {
    // if (res % a == 0 && res % b == 0)
    // break;
    // res++;
    // }
    // return res;
    // }
}
