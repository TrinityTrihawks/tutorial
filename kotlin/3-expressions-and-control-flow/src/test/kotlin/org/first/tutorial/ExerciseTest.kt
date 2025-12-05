package org.first.tutorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun stopsWhenObstacleTooClose() {
        val exercise = Exercise()
        assertEquals("STOP", exercise.decideAction(0.3, 12.5))
        assertFalse(exercise.isSafeToDrive(0.3, 12.5))
    }

    @Test
    fun returnsForLowBattery() {
        val exercise = Exercise()
        assertEquals("RETURN_TO_CHARGER", exercise.decideAction(1.0, 10.8))
        assertFalse(exercise.isSafeToDrive(1.0, 10.8))
    }

    @Test
    fun drivesWhenClear() {
        val exercise = Exercise()
        assertEquals("DRIVE_FORWARD", exercise.decideAction(2.0, 12.5))
        assertTrue(exercise.isSafeToDrive(2.0, 12.5))
    }

    @Test
    fun handlesBadSensorData() {
        val exercise = Exercise()
        assertEquals("SENSOR_ERROR", exercise.decideAction(-1.0, 12.0))
    }
}
