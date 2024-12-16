package Bitwise;

public class SwapBit {
    public static int swapBits(int n) {
        int odd = (n & 0x55555555) << 1;
        int even = (n & 0xAAAAAAAA) >> 1;
        return odd | even;

    }

}
