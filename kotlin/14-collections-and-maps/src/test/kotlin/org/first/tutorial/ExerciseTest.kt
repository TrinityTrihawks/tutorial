package org.first.tutorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun countsCommands() {
        val exercise = Exercise()
        val counts = exercise.countCommands(listOf("shoot", "drive", "shoot", "drive", "shoot"))
        assertEquals(3, counts["shoot"])
        assertEquals(2, counts["drive"])
    }

    @Test
    fun findsMostCommon() {
        val exercise = Exercise()
        val command = exercise.mostCommonCommand(mapOf("shoot" to 5, "drive" to 2, "intake" to 3))
        assertEquals("shoot", command)
        assertEquals("NONE", exercise.mostCommonCommand(mapOf()))
    }

    @Test
    fun describesBindings() {
        val exercise = Exercise()
        val bindings = mapOf(1 to "shoot", 2 to "intake")
        assertEquals("Button 1: shoot", exercise.describeBinding(bindings, 1))
        assertEquals("Button 3: unassigned", exercise.describeBinding(bindings, 3))
    }
}
