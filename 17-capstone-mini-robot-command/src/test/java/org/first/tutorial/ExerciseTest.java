package org.first.tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.first.tutorial.Exercise.CommandRunner;
import org.junit.jupiter.api.Test;

class ExerciseTest {

    @Test
    void executesCommandsAndTracksDistance() {
        CommandRunner runner = new CommandRunner();
        List<String> log = runner.execute(List.of(
                "MOVE 2.0",
                "TURN 90",
                "MOVE 1.5",
                "WAIT 0.5"
        ));

        assertEquals(List.of(
                "Moved 2.0m",
                "Turned 90.0deg",
                "Moved 1.5m",
                "Waited 0.5s"
        ), log);
        assertEquals(3.5, runner.getDistanceTraveled(), 0.0001);
    }

    @Test
    void handlesUnknown() {
        CommandRunner runner = new CommandRunner();
        List<String> log = runner.execute(List.of("HOP 10"));
        assertEquals(List.of("Unknown command: HOP 10"), log);
        assertEquals(0.0, runner.getDistanceTraveled(), 0.0001);
    }
}
