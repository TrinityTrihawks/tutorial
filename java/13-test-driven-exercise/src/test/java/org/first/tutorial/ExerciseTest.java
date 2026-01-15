package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class ExerciseTest {

    // ----------------------------------------------------------------------------------
    // INSTRUCTION: Test Driven Development (TDD)
    // ----------------------------------------------------------------------------------
    // 1. Write a test case below that fails (because the code doesn't exist yet).
    // 2. Go to Exercise.java and write just enough code to make it pass.
    // 3. Repeat.
    //
    // Goal: Implement CommandParser.parse(script)
    // - Input: String script (e.g., "FORWARD 1\nWAIT\nFORWARD 2")
    // - Output: List<String> of commands.
    // ----------------------------------------------------------------------------------

    @Test
    void testParseSingleCommand() {
        // TODO: Uncomment and fix the test
        // Exercise.CommandParser parser = new Exercise.CommandParser();
        // List<String> result = parser.parse("FORWARD 1");
        // assertEquals(1, result.size());
        // assertEquals("FORWARD 1", result.get(0));
        fail("Uncomment the test above and implement the code!");
    }

    @Test
    void testParseMultipleLines() {
        // TODO: Test with "FORWARD 1\nWAIT"
        // Should return list of size 2.
    }
}