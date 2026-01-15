package org.first.tutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

public class Exercise {

    /**
     * Reads all lines from a file.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Use <code>Files.readAllLines(path)</code> to read the file.
     * Return the resulting list of strings.
     * </p>
     */
    public List<String> readLines(Path path) throws IOException {
        // TODO: read all lines from the file.
        return List.of();
    }

    /**
     * Writes lines to a file.
     *
     * <p>
     * <strong>Instruction:</strong>
     * Use <code>Files.write(path, lines)</code> to write the list of strings to the file.
     * </p>
     */
    public void writeLog(Path path, List<String> lines) throws IOException {
        // TODO: overwrite the file with the provided lines.
    }

    /**
     * Finds the first non-empty line in a file.
     *
     * <p>
     * <strong>Instruction:</strong>
     * 1. Call <code>readLines(path)</code> to get all lines.
     * 2. Loop through the lines.
     * 3. Trim each line (<code>line.trim()</code>) to remove whitespace.
     * 4. Check if the trimmed line is not empty (<code>!trimmed.isEmpty()</code>).
     * 5. Return the first matching trimmed line.
     * 6. If no non-empty lines are found, return "NONE".
     * </p>
     */
    public String firstNonEmptyLine(Path path) throws IOException {
        return "";
    }
}