package org.first.tutorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun greetsByName() {
        val exercise = Exercise()
        assertEquals("Hello, Driver! Ready to boot the robot brain.", exercise.greet("Driver"))
    }

    @Test
    fun trimsWhitespace() {
        val exercise = Exercise()
        assertEquals("Hello, Pilot! Ready to boot the robot brain.", exercise.greet("  Pilot  "))
    }
}
