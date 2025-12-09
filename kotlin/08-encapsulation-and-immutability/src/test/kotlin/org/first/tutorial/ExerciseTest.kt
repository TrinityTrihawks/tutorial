package org.first.tutorial

import org.first.tutorial.Exercise.ImmutablePose
import org.first.tutorial.Exercise.RobotSettings
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun robotSettingsValidates() {
        val settings = RobotSettings("Photon", 3.5)
        assertEquals("Photon", settings.robotName)
        assertEquals(3.5, settings.maxSpeedMetersPerSec, 0.0001)
        settings.maxSpeedMetersPerSec = 4.0
        assertEquals(4.0, settings.maxSpeedMetersPerSec, 0.0001)
        assertThrows(IllegalArgumentException::class.java) { settings.maxSpeedMetersPerSec = 0.0 }
    }

    @Test
    fun immutablePoseReturnsNewInstance() {
        val pose = ImmutablePose(1.0, 2.0, 90.0)
        val turned = pose.withHeading(180.0)
        assertEquals(1.0, pose.x, 0.0001)
        assertEquals(90.0, pose.headingDegrees, 0.0001)
        assertEquals(180.0, turned.headingDegrees, 0.0001)
    }
}
