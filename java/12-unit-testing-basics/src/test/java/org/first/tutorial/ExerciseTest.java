package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.first.tutorial.Exercise.BatteryMonitor;

class ExerciseTest {

    // ----------------------------------------------------------------------------------
    // INSTRUCTION: Write unit tests for the BatteryMonitor class.
    // ----------------------------------------------------------------------------------
    // The BatteryMonitor class (in src/main/java) has methods:
    // - isCritical(voltage): true if <= min
    // - isHealthy(voltage): true if >= max
    // - percentRemaining(voltage): calculated percentage
    //
    // Use assertions to verify behavior:
    // - assertTrue(condition)
    // - assertFalse(condition)
    // - assertEquals(expected, actual)
    // ----------------------------------------------------------------------------------

    @Test
    void testIsCritical() {
        // TODO: Create a monitor with min=11.0, max=13.0
        // Check that 10.5 returns true (critical)
        // Check that 12.0 returns false (not critical)
    }

    @Test
    void testIsHealthy() {
        // TODO: Create a monitor with min=11.0, max=13.0
        // Check that 13.5 returns true
        // Check that 12.0 returns false
    }

    @Test
    void testPercentRemaining() {
        // TODO: Create a monitor with min=10.0, max=14.0 (Range = 4.0)
        // Test voltage 12.0 (should be 50%) -> assertEquals(50.0, monitor.percentRemaining(12.0), 0.001);
        // Test voltage 10.0 (should be 0%)
        // Test voltage 14.0 (should be 100%)
    }
}