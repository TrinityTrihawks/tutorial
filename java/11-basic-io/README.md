## Goal
Read and write small text files for robot configs/logs.

## Background
- Files let programs remember information between runs.
- Java’s `java.nio.file.Files` class has helpers to read and write entire files without manual looping.
- File operations can fail (missing path, no permission), so they throw `IOException` you must handle or declare.

## Steps
- Implement in `src/main/java/org/first/tutorial/Exercise.java`:
  - `List<String> readLines(Path path)` — return all lines (trim trailing newlines but keep internal spaces).
  - `void writeLog(Path path, List<String> lines)` — overwrite the file with each line plus a newline.
  - `String firstNonEmptyLine(Path path)` — return the first non-blank trimmed line, or `"NONE"` if none exist.
- Use `java.nio.file.Files` utilities to keep things concise.
- Run `../gradlew :11-basic-io:test`.

## Tip
- Remember to close resources; `Files.readAllLines` and `Files.write` help with that.
