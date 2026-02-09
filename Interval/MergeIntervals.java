package Interval;

import java.util.*;

public class MergeIntervals {
    
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        List<int[]> merged = new ArrayList<>();
        
        for (int[] interval : intervals) {
            // If merged list is empty or no overlap, add interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlapping intervals, merge them
                merged.get(merged.size() - 1)[1] = 
                    Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
    
    public static void main(String[] args) {
        int[][] intervals = { {1,3}, {2,6}, {8,10}, {15,18} };
        int[][] mergedIntervals = merge(intervals);
        
        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
