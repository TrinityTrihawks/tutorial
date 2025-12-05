package org.first.tutorial

import org.first.tutorial.Exercise.CommandRunner
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun executesCommandsAndTracksDistance() {
        val runner = CommandRunner()
        val log = runner.execute(
            listOf(
                "MOVE 2.0",
                "TURN 90",
                "MOVE 1.5",
                "WAIT 0.5"
            )
        )

        assertEquals(
            listOf(
                "Moved 2.0m",
                "Turned 90.0deg",
                "Moved 1.5m",
                "Waited 0.5s"
            ),
            log
        )
        assertEquals(3.5, runner.getDistanceTraveled(), 0.0001)
    }

    @Test
    fun handlesUnknown() {
        val runner = CommandRunner()
        val log = runner.execute(listOf("HOP 10"))
        assertEquals(listOf("Unknown command: HOP 10"), log)
        assertEquals(0.0, runner.getDistanceTraveled(), 0.0001)
    }
}
