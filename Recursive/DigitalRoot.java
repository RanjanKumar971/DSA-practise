package Recursive;

public class DigitalRoot {
    public static boolean isDigitalRoot(int n) {
        n = n % 9;
        if (n == 2 || n == 3 || n == 5 || n == 7)
            return true;
        return false;

    }

    public static void main(String[] args) {

        System.out.println(isDigitalRoot(29));

    }
}
