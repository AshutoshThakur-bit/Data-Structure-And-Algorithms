package Binary;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i >> 1] + (i & 1);
        }
        return bits;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 0 1 1 2 1 2
    }
}

