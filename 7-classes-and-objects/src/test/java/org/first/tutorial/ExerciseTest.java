package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.first.tutorial.Exercise.Robot;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void tracksTasksAndBattery() {
        Robot robot = new Robot("Atlas", 12.0);
        robot.completeTask();
        robot.completeTask();
        String summary = robot.summary();
        assertTrue(summary.contains("Atlas"));
        assertTrue(summary.contains("2 tasks"));
        assertTrue(summary.contains("11.8"), "Battery should drop by 0.2 total");
    }

    @Test
    void batteryDoesNotGoNegative() {
        Robot robot = new Robot("Tiny", 0.05);
        robot.completeTask();
        robot.completeTask();
        String summary = robot.summary();
        assertTrue(summary.contains("0.0"), "Battery should not be negative");
    }
}
