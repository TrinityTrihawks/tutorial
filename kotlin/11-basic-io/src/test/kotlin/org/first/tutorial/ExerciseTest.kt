package org.first.tutorial

import java.nio.file.Files
import java.nio.file.Path
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun readsAndWritesLogs() {
        val exercise = Exercise()
        val temp = Files.createTempFile("log", ".txt")

        exercise.writeLog(temp, listOf("start", "drive", "stop"))
        val lines = exercise.readLines(temp)
        assertEquals(listOf("start", "drive", "stop"), lines)
    }

    @Test
    fun findsFirstNonEmptyLine() {
        val exercise = Exercise()
        val temp = Files.createTempFile("log", ".txt")
        Files.write(temp, listOf("   ", "", "battery ok", "later"))
        assertEquals("battery ok", exercise.firstNonEmptyLine(temp))

        val empty = Files.createTempFile("log-empty", ".txt")
        Files.write(empty, listOf("   ", " "))
        assertEquals("NONE", exercise.firstNonEmptyLine(empty))
        assertTrue(Files.deleteIfExists(temp))
        assertTrue(Files.deleteIfExists(empty))
    }
}
