package Binary;

public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {

        while(b != 0){
            int carry = (a & b) << 1;
             a = a ^ b;
             b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 5;  // (0101)
        int b = 3;  // (0011)
        System.out.println("Sum = " + getSum(a, b)); // Output: 8
    }
}
