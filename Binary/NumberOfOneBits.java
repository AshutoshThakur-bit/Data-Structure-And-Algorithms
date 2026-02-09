package Binary;

public class NumberOfOneBits {
    public static int countOneBits(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);  // check last bit
            n >>>= 1;          // unsigned right shift
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 13; // binary: 1101
        System.out.println("Number of 1 bits = " + countOneBits(n)); // Output: 3
    }
}
