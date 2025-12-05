package org.first.tutorial

import org.first.tutorial.Exercise.MecanumDrive
import org.first.tutorial.Exercise.TankDrive
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun tankDriveFormatsAndClamps() {
        val drive = TankDrive()
        val output = drive.drive(0.8, 0.5) // left=1.3 -> clamp to 1.0, right=0.3
        assertTrue(output.contains("Tank"))
        assertTrue(output.contains("left:1.0"))
        assertTrue(output.contains("right:0.3"))
    }

    @Test
    fun mecanumDriveFormats() {
        val drive = MecanumDrive()
        val output = drive.drive(0.6, -0.4) // fl=0.2 fr=1.0 after clamp
        assertTrue(output.contains("Mecanum"))
        assertTrue(output.contains("FL:0.2"))
        assertTrue(output.contains("FR:1.0"))
        assertTrue(output.contains("RR:1.0"))
    }
}
