package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.first.tutorial.Exercise.SensorReadException;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void parsesValidReading() throws Exception {
        Exercise exercise = new Exercise();
        assertEquals(12.3, exercise.parseSensorReading("12.3"), 0.0001);
    }

    @Test
    void rejectsBadReadings() {
        Exercise exercise = new Exercise();
        assertThrows(SensorReadException.class, () -> exercise.parseSensorReading(null));
        assertThrows(SensorReadException.class, () -> exercise.parseSensorReading(""));
        assertThrows(SensorReadException.class, () -> exercise.parseSensorReading("-5"));
        assertThrows(SensorReadException.class, () -> exercise.parseSensorReading("abc"));
    }

    @Test
    void averagesValidOnesAndSkipsBad() throws Exception {
        Exercise exercise = new Exercise();
        String[] raw = {"10.0", "oops", "20.0", "-1"};
        assertEquals(15.0, exercise.averageReadings(raw), 0.0001);
    }

    @Test
    void throwsWhenNoneValid() {
        Exercise exercise = new Exercise();
        String[] raw = {"bad", "-2"};
        assertThrows(SensorReadException.class, () -> exercise.averageReadings(raw));
    }
}
