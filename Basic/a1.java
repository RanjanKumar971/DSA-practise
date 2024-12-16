public class a1 {
    public static void main(String[] args) {
        System.out.println(isgoodnum(32));
    }

    public static int isgoodnum(long n) {
        int i = 0;
        while (n != 0) {
            long temp = n % 10;
            if (i % 2 == 0)
                if (temp % 2 != 0)
                    return 0;
                else
                    ;
            else if (!(temp == 2 || temp == 3 || temp == 5 || temp == 7))
                return 0;
            n = n / 10;
            i++;

        }
        return 1;
    }

}
