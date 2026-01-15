package org.first.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public static class CommandRunner {
        private double distanceTraveled = 0.0;

        /**
         * Executes a list of string commands.
         *
         * <p>
         * <strong>Instruction:</strong>
         * Loop through the <code>commands</code> list.
         * Parse each command string:
         * <ul>
         *   <li>"FORWARD <n>": Add n to <code>distanceTraveled</code>. Add "Driven <n>m" to result list.</li>
         *   <li>"BACKWARD <n>": Add n to <code>distanceTraveled</code> (odometers usually count up). Add "Driven <n>m" to result list.</li>
         *   <li>"WAIT <n>": Add "Waited <n>s" to result list.</li>
         *   <li>Unknown: Add "Error" to result list.</li>
         * </ul>
         * Return the list of result strings.
         * </p>
         */
        public List<String> execute(List<String> commands) {
            List<String> results = new ArrayList<>();
            // TODO: Parse commands and update state.
            return results;
        }

        public double getDistanceTraveled() {
            return distanceTraveled;
        }
    }
}