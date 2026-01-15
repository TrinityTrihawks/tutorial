package org.first.tutorial;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    /**
     * Converts an array of waypoints to a List.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Create a new <code>ArrayList</code> and add all elements from the <code>waypoints</code> array to it.
     * Return the list.
     * </p>
     *
     * <p>
     * <strong>Explanation:</strong>
     * Arrays have fixed size, but Lists can grow.
     * <pre>
     * List<String> list = new ArrayList<>();
     * for (String s : array) {
     *     list.add(s);
     * }
     * </pre>
     * </p>
     */
    public List<String> toWaypointList(String[] waypoints) {
        return null;
    }

    /**
     * Finds the index of a specific waypoint in the list.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Return the index of <code>target</code> in the <code>waypoints</code> list.
     * Return -1 if it is not found.
     * </p>
     *
     * <p>
     * <strong>Tip:</strong>
     * Lists have a built-in method: <code>waypoints.indexOf(target)</code>.
     * </p>
     */
    public int indexOfWaypoint(List<String> waypoints, String target) {
        return -2;
    }

    /**
     * Joins command strings together.
     *
     * <p>
     * <strong>Instruction:</strong>
     * If the list is empty, return "EMPTY".
     * Otherwise, join all strings in the list separated by " -> ".
     * </p>
     *
     * <p>
     * <strong>Example:</strong>
     * List: ["UP", "LEFT"] -> Return "UP -> LEFT"
     * </p>
     *
     * <p>
     * <strong>Tip:</strong>
     * You can use a loop with StringBuilder, or <code>String.join(" -> ", commands)</code>.
     * </p>
     */
    public String joinCommands(List<String> commands) {
        return "";
    }
}