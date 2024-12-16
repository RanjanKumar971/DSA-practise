public class Divisor {
    public static void divisor(int n) {
        int i;
        for (i = 1; i * i < n; i++)
            if (n % i == 0)
                System.out.print(i + " ");

        for (; i >= 1; i--)
            if (n % i == 0)
                System.out.print((n / i) + " ");

    }

    public static void main(String[] args) {
        divisor(25);
    }

}
