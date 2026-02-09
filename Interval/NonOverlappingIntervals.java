package Interval;

import java.util.*;

public class NonOverlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Sort intervals by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;        // Number of intervals to remove
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                // Overlap detected, remove this interval
                count++;
            } else {
                // No overlap, update end
                end = intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = { {1,2}, {2,3}, {3,4}, {1,3} };
        System.out.println("Intervals to remove: " + eraseOverlapIntervals(intervals));
    }
}
