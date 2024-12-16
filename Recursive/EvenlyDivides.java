package Recursive;

public class EvenlyDivides {

    static int evenlyDivides(int n) {

        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;

        int remainderCount = evenlyDivides(n / 10);

        if (lastDigit != 0 && n % lastDigit == 0) {
            return remainderCount + 1;
        } else {
            return remainderCount;
        }
    }

    public static void main(String[] args) {
        System.out.println(evenlyDivides(12));
    }

}
