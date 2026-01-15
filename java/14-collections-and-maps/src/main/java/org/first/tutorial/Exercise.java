package org.first.tutorial;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Exercise {

    /**
     * Counts the frequency of each command.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. Create a <code>Map<String, Integer></code> (e.g., HashMap).
     * 2. Loop through the <code>commands</code> list.
     * 3. For each command, increment its count in the map.
     * </p>
     *
     * <p>
     * <strong>Tip:</strong>
     * <code>map.put(cmd, map.getOrDefault(cmd, 0) + 1);</code>
     * </p>
     */
    public Map<String, Integer> countCommands(List<String> commands) {
        // TODO: build a frequency map.
        return new HashMap<>();
    }

    /**
     * Finds the command that appears most frequently.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. Iterate through the map's entry set (<code>counts.entrySet()</code>).
     * 2. Keep track of the entry with the highest value (count).
     * 3. Return the key (command name) of that entry.
     * 4. If map is empty, return "NONE".
     * </p>
     */
    public String mostCommonCommand(Map<String, Integer> counts) {
        // TODO: return the command with the highest count or "NONE" if empty.
        return "";
    }

    /**
     * Describes the function of a button.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. Look up the <code>button</code> ID in the <code>buttonBindings</code> map.
     * 2. If it exists, return "Button [id]: [function]".
     * 3. If it doesn't exist, return "Button [id]: Unassigned".
     * </p>
     *
     * <p>
     * <strong>Example:</strong>
     * If button 1 maps to "Shoot", return "Button 1: Shoot".
     * </p>
     */
    public String describeBinding(Map<Integer, String> buttonBindings, int button) {
        // TODO: describe the binding or mark as unassigned.
        return "";
    }
}