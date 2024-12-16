package Bitwise;

public class PowerOfTwo {
    public static boolean is2sPower(int n) {
        if (n == 0)
            return false;
        return (n & (n - 1)) == 0;

    }

    public static void main(String[] args) {
        System.out.println(is2sPower(2));
    }

}
