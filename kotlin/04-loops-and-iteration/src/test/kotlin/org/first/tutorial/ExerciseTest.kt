package org.first.tutorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun countsDangerousReadings() {
        val exercise = Exercise()
        val distances = intArrayOf(120, 45, 60, 30, 200, 50)
        assertEquals(4, exercise.countObstacles(distances, 60))
    }

    @Test
    fun computesAverage() {
        val exercise = Exercise()
        val values = doubleArrayOf(10.0, 20.0, 30.0)
        assertEquals(20.0, exercise.average(values), 0.0001)
    }

    @Test
    fun returnsZeroForEmptyAverage() {
        val exercise = Exercise()
        assertEquals(0.0, exercise.average(doubleArrayOf()), 0.0001)
    }

    @Test
    fun findsFirstDangerousIndex() {
        val exercise = Exercise()
        val distances = intArrayOf(120, 100, 80, 40, 70)
        assertEquals(3, exercise.indexOfFirstBelow(distances, 60))
        assertEquals(-1, exercise.indexOfFirstBelow(distances, 30))
    }
}
