package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void filtersAboveThreshold() {
        Exercise exercise = new Exercise();
        List<Double> filtered = exercise.filterAbove(List.of(5.0, 9.0, 12.0, 8.5), 9.0);
        assertEquals(List.of(12.0), filtered);
    }

    @Test
    void averages() {
        Exercise exercise = new Exercise();
        assertEquals(7.5, exercise.average(List.of(5.0, 10.0)), 0.0001);
        assertEquals(0.0, exercise.average(List.of()), 0.0001);
    }

    @Test
    void summarizes() {
        Exercise exercise = new Exercise();
        String summary = exercise.summary(List.of(5.0, 10.0, 15.0));
        assertEquals("count:3 avg:10.0", summary);
    }
}
