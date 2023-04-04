package com.solution.algorithms.sort;

import java.util.*;
import java.util.stream.Collectors;

public class MergeInterval {
    public int[][] merge(int[][] intervals) {
        Stack<int[]> stack = new Stack<>();
        Comparator<int[]> intervalComparator = (e1, e2) -> {
            int start1 = e1[0];
            int start2 = e2[0];
            return start1 - start2;
        };
        Arrays.sort(intervals, intervalComparator);

        for (int[] interval : intervals) {
            if (stack.isEmpty()) {
                stack.push(interval);
                continue;
            }
            int[] previous = stack.peek();
            if (!isOverlap(previous, interval)) {
                stack.push(interval);
            } else {
                previous = stack.pop();
                stack.push(merge(previous, interval));
            }

        }
        int[][] mergedArray = new int[stack.size()][];
        int index = 0;
        for (Object element : stack.toArray()) {
            mergedArray[index++] = (int[]) element;
        }
        return mergedArray;
    }

    private boolean isOverlap(int[] interval1, int[] interval2) {
        int end1 = interval1[1];
        int start2 = interval2[0];
        return start2 <= end1;
    }

    private int[] merge(int[] interval1, int[] interval2) {
        int start = interval1[0];
        int end = Math.max(interval1[1], interval2[1]);
        return new int[]{start, end};
    }
}
