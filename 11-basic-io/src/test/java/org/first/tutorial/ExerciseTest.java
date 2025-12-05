package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void readsAndWritesLogs() throws Exception {
        Exercise exercise = new Exercise();
        Path temp = Files.createTempFile("log", ".txt");

        exercise.writeLog(temp, List.of("start", "drive", "stop"));
        List<String> lines = exercise.readLines(temp);
        assertEquals(List.of("start", "drive", "stop"), lines);
    }

    @Test
    void findsFirstNonEmptyLine() throws Exception {
        Exercise exercise = new Exercise();
        Path temp = Files.createTempFile("log", ".txt");
        Files.write(temp, List.of("   ", "", "battery ok", "later"));
        assertEquals("battery ok", exercise.firstNonEmptyLine(temp));

        Path empty = Files.createTempFile("log-empty", ".txt");
        Files.write(empty, List.of("   ", " "));
        assertEquals("NONE", exercise.firstNonEmptyLine(empty));
        assertTrue(Files.deleteIfExists(temp));
        assertTrue(Files.deleteIfExists(empty));
    }
}
