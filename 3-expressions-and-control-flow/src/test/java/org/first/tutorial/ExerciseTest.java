package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void stopsWhenObstacleTooClose() {
        Exercise exercise = new Exercise();
        assertEquals("STOP", exercise.decideAction(0.3, 12.5));
        assertFalse(exercise.isSafeToDrive(0.3, 12.5));
    }

    @Test
    void returnsForLowBattery() {
        Exercise exercise = new Exercise();
        assertEquals("RETURN_TO_CHARGER", exercise.decideAction(1.0, 10.8));
        assertFalse(exercise.isSafeToDrive(1.0, 10.8));
    }

    @Test
    void drivesWhenClear() {
        Exercise exercise = new Exercise();
        assertEquals("DRIVE_FORWARD", exercise.decideAction(2.0, 12.5));
        assertTrue(exercise.isSafeToDrive(2.0, 12.5));
    }

    @Test
    void handlesBadSensorData() {
        Exercise exercise = new Exercise();
        assertEquals("SENSOR_ERROR", exercise.decideAction(-1.0, 12.0));
    }
}
