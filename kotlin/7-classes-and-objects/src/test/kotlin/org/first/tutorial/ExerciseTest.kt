package org.first.tutorial

import org.first.tutorial.Exercise.Robot
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun tracksTasksAndBattery() {
        val robot = Robot("Atlas", 12.0)
        robot.completeTask()
        robot.completeTask()
        val summary = robot.summary()
        assertTrue(summary.contains("Atlas"))
        assertTrue(summary.contains("2 tasks"))
        assertTrue(summary.contains("11.8"), "Battery should drop by 0.2 total")
    }

    @Test
    fun batteryDoesNotGoNegative() {
        val robot = Robot("Tiny", 0.05)
        robot.completeTask()
        robot.completeTask()
        val summary = robot.summary()
        assertTrue(summary.contains("0.0"), "Battery should not be negative")
    }
}
