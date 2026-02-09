package Binary;

public class ReverseBits {
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;        // make space
            result |= (n & 1);   // add last bit of n
            n >>= 1;             // remove last bit from n
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 43261596; // binary: 00000010100101000001111010011100
        System.out.println("Reversed Bits = " + reverseBits(n));
        // Output: 964176192 (binary: 00111001011110000010100101000000)
    }
}

