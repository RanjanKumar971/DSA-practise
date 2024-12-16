public class sumOfNaturalNos {
    public static int sumOfNaturalNo(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 2;
        int sum = sumOfNaturalNo(n);
        System.out.println("sum of first " + n + " natural nos. is " + sum);
    }

}
