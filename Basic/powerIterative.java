public class powerIterative {
    public static int pow(int x, int n) {
        int res = 1;
        while (n != 0) {
            if ((n & 1) == 1)// (n % 2 != 0)-->odd
                res *= x;

            x *= x;
            n /= 2;// n>>1
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 4));
    }

}
