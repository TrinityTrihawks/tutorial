package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void calculatesInchesPerRotation() {
        Exercise exercise = new Exercise();
        exercise.wheelCount = 4;
        double inches = exercise.inchesPerWheelRotation(6.0);
        assertEquals(Math.PI * 6.0 * 4, inches, 0.0001);
    }

    @Test
    void formatsStatusLine() {
        Exercise exercise = new Exercise();
        exercise.driverName = "Mia";
        exercise.wheelCount = 4;
        exercise.batteryVoltage = 12.5;
        exercise.enabled = true;

        String status = exercise.statusLine();
        assertTrue(status.contains("Driver Mia"), "Driver name missing");
        assertTrue(status.contains("wheels:4"), "Wheel count missing");
        assertTrue(status.contains("battery:12.5V"), "Battery missing");
        assertTrue(status.contains("enabled:true"), "Enabled flag missing");
    }
}
