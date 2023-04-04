package com.solution.algorithms.sort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MergeIntervalTest {

    @Spy
    MergeInterval mergeInterval;

    @Test
    void merge() {
        int[][] intervals = {{2,6},{1,3},{15,18},{8,10}};
        int[][] expected = {{1,6},{8,10},{15,18}};
        int[][] mergedIntervals = mergeInterval.merge(intervals);
        assertThat(mergedIntervals).isEqualTo(expected);
    }
}