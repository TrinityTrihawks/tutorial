package org.first.tutorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun calculatesCircumference() {
        val exercise = Exercise()
        assertEquals(Math.PI * 6.0, exercise.wheelCircumference(6.0), 0.0001)
    }

    @Test
    fun calculatesDistanceForRotations() {
        val exercise = Exercise()
        assertEquals(Math.PI * 4.0 * 10, exercise.distanceForRotations(4.0, 10), 0.0001)
    }

    @Test
    fun negativeRotationsBecomeZero() {
        val exercise = Exercise()
        assertEquals(0.0, exercise.distanceForRotations(4.0, -2), 0.0001)
    }

    @Test
    fun formatsMove() {
        val exercise = Exercise()
        assertEquals("MOVE FORWARD 2.5m", exercise.formatMove("forward", 2.5))
    }
}
