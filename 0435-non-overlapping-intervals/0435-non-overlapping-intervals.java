//referenced
public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int toBeRemoved = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0]; // Sort the intervals based on their start points
            }
        });

        int end = intervals[0][1]; // Initialize the end time of the first interval

        // Iterate through the remaining intervals (starting from the second one)
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] < end) {
                // If the current interval's start time is less than the end time of the last interval,
                // it means there is an overlap between the intervals.
                toBeRemoved++; // Increment the count of intervals to be removed

                // Greedily choose the interval with the smaller end time to keep (to minimize overlaps)
                end = Math.min(end, interval[1]);
            } else {
                // If there is no overlap, update the end time to the current interval's end time.
                end = interval[1];
            }
        }

        return toBeRemoved; // Return the total number of intervals to be removed
    }
}