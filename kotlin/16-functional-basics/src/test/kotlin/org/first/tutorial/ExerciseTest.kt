package org.first.tutorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun filtersAboveThreshold() {
        val exercise = Exercise()
        val filtered = exercise.filterAbove(listOf(5.0, 9.0, 12.0, 8.5), 9.0)
        assertEquals(listOf(12.0), filtered)
    }

    @Test
    fun averages() {
        val exercise = Exercise()
        assertEquals(7.5, exercise.average(listOf(5.0, 10.0)), 0.0001)
        assertEquals(0.0, exercise.average(listOf()), 0.0001)
    }

    @Test
    fun summarizes() {
        val exercise = Exercise()
        val summary = exercise.summary(listOf(5.0, 10.0, 15.0))
        assertEquals("count:3 avg:10.0", summary)
    }
}
