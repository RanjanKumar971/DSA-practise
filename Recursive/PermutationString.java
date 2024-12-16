package Recursive;

public class PermutationString {
    public static void permutate(String s, int i) {
        if (i == s.length() - 1) {
            System.out.println(s);
            return;
        }
        for (int j = i; j < s.length(); j++) {
            s = swap(s, i, j);
            permutate(s, i + 1);
            s = swap(s, i, j);

        }
    }

    public static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        permutate("abc", 0);
    }

}
