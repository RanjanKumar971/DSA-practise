public class Tobinary {
    public static void printBin(int n) {
        if (n == 0)
            return;
        printBin(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        printBin(5);
    }
}
