package Bitwise;

public class SetBit {
    public static boolean checkSet(int n, int k) {
        n = n >> (k - 1);
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        System.out.println(checkSet(5, 3));
    }

}
