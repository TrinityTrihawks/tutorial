package org.first.tutorial

import org.first.tutorial.Exercise.RobotMode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun describesModes() {
        val exercise = Exercise()
        assertEquals("Autonomous: following pre-programmed path", exercise.describeMode(RobotMode.AUTO))
        assertEquals("Teleop: driver-controlled", exercise.describeMode(RobotMode.TELEOP))
        assertEquals("Test: running diagnostics", exercise.describeMode(RobotMode.TEST))
        assertEquals("Disabled: motors off", exercise.describeMode(RobotMode.DISABLED))
    }

    @Test
    fun parsesFromStrings() {
        val exercise = Exercise()
        assertEquals(RobotMode.AUTO, exercise.fromString("auto"))
        assertEquals(RobotMode.TELEOP, exercise.fromString("TELEOP"))
        assertEquals(RobotMode.DISABLED, exercise.fromString("???"))
    }
}
