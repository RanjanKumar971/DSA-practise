package Recursive;

public class subSet {
    public static void printSet(String s, String curr, int i) {
        if (i == s.length()) {
            System.out.print(curr + " ");
            return;
        }

        printSet(s, curr, i + 1);
        printSet(s, curr + s.charAt(i), i + 1);

    }

    public static void main(String[] args) {
        printSet("abc", "", 0);
        long i = (long) (10e9 + 7);
        System.out.println(i);

    }
}
