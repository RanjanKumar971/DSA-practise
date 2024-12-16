public class countDigit {
    public static void main(String[] args) {
        int x = 1234;
        System.out.println(count(x));
    }

    public static int count(int x) {
        return (int) (Math.log10(x) + 1);
        // t(n)=O(1)
    }

    // public static int count(int x) {
    // int c = 0;

    // while (x != 0) {
    // c++;
    // x /= 10;
    // }
    // return c;
    // //t(n)=thetha(d);d--> no. of digits
    // //t(n)=thetha(log(n))
    // }

    // public static int count(int x) {
    // if (x == 0)
    // return 0;
    // return 1 + count(x / 10);
    // }
}
