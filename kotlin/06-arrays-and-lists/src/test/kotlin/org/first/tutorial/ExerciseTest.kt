package org.first.tutorial

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotSame
import org.junit.jupiter.api.Test

class ExerciseTest {

    @Test
    fun copiesArrayToList() {
        val exercise = Exercise()
        val waypoints = arrayOf("A", "B", "C")
        val list = exercise.toWaypointList(waypoints)
        assertEquals(3, list.size)
        list.add("D")
        assertEquals(3, waypoints.size, "Original array should not change")
        assertNotSame(waypoints, list, "List should be a copy")
    }

    @Test
    fun findsIndexOrMissing() {
        val exercise = Exercise()
        val list = exercise.toWaypointList(arrayOf("Base", "Bridge", "Ramp"))
        assertEquals(1, exercise.indexOfWaypoint(list, "Bridge"))
        assertEquals(-1, exercise.indexOfWaypoint(list, "Goal"))
    }

    @Test
    fun joinsCommands() {
        val exercise = Exercise()
        val commands = exercise.toWaypointList(arrayOf("FORWARD", "TURN LEFT", "SCORE"))
        assertEquals("FORWARD -> TURN LEFT -> SCORE", exercise.joinCommands(commands))
        assertEquals("EMPTY", exercise.joinCommands(emptyList()))
    }
}
