package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void countsCommands() {
        Exercise exercise = new Exercise();
        Map<String, Integer> counts = exercise.countCommands(List.of("shoot", "drive", "shoot", "drive", "shoot"));
        assertEquals(3, counts.get("shoot"));
        assertEquals(2, counts.get("drive"));
    }

    @Test
    void findsMostCommon() {
        Exercise exercise = new Exercise();
        String command = exercise.mostCommonCommand(Map.of("shoot", 5, "drive", 2, "intake", 3));
        assertEquals("shoot", command);
        assertEquals("NONE", exercise.mostCommonCommand(Map.of()));
    }

    @Test
    void describesBindings() {
        Exercise exercise = new Exercise();
        Map<Integer, String> bindings = Map.of(1, "shoot", 2, "intake");
        assertEquals("Button 1: shoot", exercise.describeBinding(bindings, 1));
        assertEquals("Button 3: unassigned", exercise.describeBinding(bindings, 3));
    }
}
