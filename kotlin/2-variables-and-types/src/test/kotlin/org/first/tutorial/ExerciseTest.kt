package org.first.tutorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun calculatesInchesPerRotation() {
        val exercise = Exercise()
        exercise.wheelCount = 4
        val inches = exercise.inchesPerWheelRotation(6.0)
        assertEquals(Math.PI * 6.0 * 4, inches, 0.0001)
    }

    @Test
    fun formatsStatusLine() {
        val exercise = Exercise()
        exercise.driverName = "Mia"
        exercise.wheelCount = 4
        exercise.batteryVoltage = 12.5
        exercise.enabled = true

        val status = exercise.statusLine()
        assertTrue(status.contains("Driver Mia"), "Driver name missing")
        assertTrue(status.contains("wheels:4"), "Wheel count missing")
        assertTrue(status.contains("battery:12.5V"), "Battery missing")
        assertTrue(status.contains("enabled:true"), "Enabled flag missing")
    }
}
