package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

import java.util.List;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void copiesArrayToList() {
        Exercise exercise = new Exercise();
        String[] waypoints = {"A", "B", "C"};
        List<String> list = exercise.toWaypointList(waypoints);
        assertEquals(3, list.size());
        list.add("D");
        assertEquals(3, waypoints.length, "Original array should not change");
        assertNotSame(waypoints, list, "List should be a copy");
    }

    @Test
    void findsIndexOrMissing() {
        Exercise exercise = new Exercise();
        List<String> list = exercise.toWaypointList(new String[]{"Base", "Bridge", "Ramp"});
        assertEquals(1, exercise.indexOfWaypoint(list, "Bridge"));
        assertEquals(-1, exercise.indexOfWaypoint(list, "Goal"));
    }

    @Test
    void joinsCommands() {
        Exercise exercise = new Exercise();
        List<String> commands = exercise.toWaypointList(new String[]{"FORWARD", "TURN LEFT", "SCORE"});
        assertEquals("FORWARD -> TURN LEFT -> SCORE", exercise.joinCommands(commands));
        assertEquals("EMPTY", exercise.joinCommands(List.of()));
    }
}
