package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.first.tutorial.Exercise.RobotMode;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void describesModes() {
        Exercise exercise = new Exercise();
        assertEquals("Autonomous: following pre-programmed path", exercise.describeMode(RobotMode.AUTO));
        assertEquals("Teleop: driver-controlled", exercise.describeMode(RobotMode.TELEOP));
        assertEquals("Test: running diagnostics", exercise.describeMode(RobotMode.TEST));
        assertEquals("Disabled: motors off", exercise.describeMode(RobotMode.DISABLED));
    }

    @Test
    void parsesFromStrings() {
        Exercise exercise = new Exercise();
        assertEquals(RobotMode.AUTO, exercise.fromString("auto"));
        assertEquals(RobotMode.TELEOP, exercise.fromString("TELEOP"));
        assertEquals(RobotMode.DISABLED, exercise.fromString("???"));
    }
}
