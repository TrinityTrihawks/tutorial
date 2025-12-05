package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void countsDangerousReadings() {
        Exercise exercise = new Exercise();
        int[] distances = {120, 45, 60, 30, 200, 50};
        assertEquals(4, exercise.countObstacles(distances, 60));
    }

    @Test
    void computesAverage() {
        Exercise exercise = new Exercise();
        double[] values = {10, 20, 30};
        assertEquals(20.0, exercise.average(values), 0.0001);
    }

    @Test
    void returnsZeroForEmptyAverage() {
        Exercise exercise = new Exercise();
        assertEquals(0.0, exercise.average(new double[]{}), 0.0001);
    }

    @Test
    void findsFirstDangerousIndex() {
        Exercise exercise = new Exercise();
        int[] distances = {120, 100, 80, 40, 70};
        assertEquals(3, exercise.indexOfFirstBelow(distances, 60));
        assertEquals(-1, exercise.indexOfFirstBelow(distances, 30));
    }
}
