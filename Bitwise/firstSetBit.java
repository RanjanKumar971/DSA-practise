package Bitwise;

public class firstSetBit {
    public static int getFirstSetBit(int n) {

        for (int i = 0; i < 32; i++)
            if (((n >> i) & 1) == 1)
                return ++i;
        return 0;
    }

}
