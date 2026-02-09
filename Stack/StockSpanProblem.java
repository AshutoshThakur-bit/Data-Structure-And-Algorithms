package Stack;

import java.util.Stack;

public class StockSpanProblem {

    // Function to calculate stock span
    public static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();  // Stack to store indices

        // First day's span is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            // Pop smaller prices from stack
            while (!stack.isEmpty() && price[i] >= price[stack.peek()]) {
                stack.pop();
            }

            // If stack empty => all previous prices <= current price
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            // Push current index
            stack.push(i);
        }

        return span;
    }

    // Driver code
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(price);

        System.out.println("Stock Span values:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
