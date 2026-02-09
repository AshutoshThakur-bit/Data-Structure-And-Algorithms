package DynamicProgramming;

import java.util.*;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] arr, int target, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) return;

        // Recursive case
        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);                    // choose
            backtrack(arr, target - arr[i], i, current, result);  // not i+1 → reuse allowed
            current.remove(current.size() - 1);     // backtrack
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 9;
        System.out.println(combinationSum(arr, target));
        // Output: [[2, 2, 3], [7]]
    }
}
