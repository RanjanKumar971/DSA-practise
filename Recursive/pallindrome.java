package Recursive;

public class pallindrome {
    public static boolean mypal(String str, int s, int e) {

        if (s >= e)
            return true;

        return (str.charAt(s) == str.charAt(e - 1)) && mypal(str, s + 1, e - 1);

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return mypal(s, 0, s.length());

    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(s);
    }

}
