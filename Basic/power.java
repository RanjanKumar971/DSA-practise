public class power {
    public static int pow(int b, int p) {
        if (p == 0)
            return 1;

        int temp = pow(b, p / 2);
        temp *= temp;

        if (p % 2 == 0)
            return temp;
        else
            return temp * b;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
