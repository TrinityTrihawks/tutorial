package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void greetsByName() {
        Exercise exercise = new Exercise();
        assertEquals("Hello, Driver! Ready to boot the robot brain.",
                exercise.greet("Driver"));
    }

    @Test
    void trimsWhitespace() {
        Exercise exercise = new Exercise();
        assertEquals("Hello, Pilot! Ready to boot the robot brain.",
                exercise.greet("  Pilot  "));
    }
}
