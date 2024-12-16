
public class pallindrome {
    public static boolean isPallindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return (rev == n);
        // t(n)=thetha(d);d--> no. of digits
        // t(n)=thetha(log(n))

    }

    public static void main(String[] args) {
        System.out.println(isPallindrome(121));
    }
}