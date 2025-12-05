package org.first.tutorial

import org.first.tutorial.Exercise.SensorReadException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun parsesValidReading() {
        val exercise = Exercise()
        assertEquals(12.3, exercise.parseSensorReading("12.3"), 0.0001)
    }

    @Test
    fun rejectsBadReadings() {
        val exercise = Exercise()
        assertThrows(SensorReadException::class.java) { exercise.parseSensorReading(null) }
        assertThrows(SensorReadException::class.java) { exercise.parseSensorReading("") }
        assertThrows(SensorReadException::class.java) { exercise.parseSensorReading("-5") }
        assertThrows(SensorReadException::class.java) { exercise.parseSensorReading("abc") }
    }

    @Test
    fun averagesValidOnesAndSkipsBad() {
        val exercise = Exercise()
        val raw = arrayOf("10.0", "oops", "20.0", "-1")
        assertEquals(15.0, exercise.averageReadings(raw), 0.0001)
    }

    @Test
    fun throwsWhenNoneValid() {
        val exercise = Exercise()
        val raw = arrayOf("bad", "-2")
        assertThrows(SensorReadException::class.java) { exercise.averageReadings(raw) }
    }
}
