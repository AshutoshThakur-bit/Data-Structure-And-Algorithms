package Interval;

import java.util.*;

public class MeetingRoomsII {

    public static int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Min-heap to keep track of end times
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            // If the earliest ending meeting is finished, reuse the room
            if (intervals[i][0] >= heap.peek()) {
                heap.poll();
            }
            heap.add(intervals[i][1]);
        }

        return heap.size();
    }

    public static void main(String[] args) {
        int[][] intervals = { {0,30}, {5,10}, {15,20} };
        System.out.println("Minimum meeting rooms required: " + minMeetingRooms(intervals));
    }
}
