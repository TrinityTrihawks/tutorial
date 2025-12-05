## Goal
Use `Map` to count and look up robot commands.

## Background
- Collections store groups of data; `Map` stores key/value pairs (like a mini dictionary).
- Looking up by key is fast and avoids long `if`/`else` chains.
- Counting with a map is a common pattern: check if a key exists, then increment.

## Steps
- Implement in `src/main/java/org/first/tutorial/Exercise.java`:
  - `Map<String, Integer> countCommands(List<String> commands)` — return a frequency map (command text -> count).
  - `String mostCommonCommand(Map<String, Integer> counts)` — return the key with the highest count, or `"NONE"` if map is empty.
  - `String describeBinding(Map<Integer, String> buttonBindings, int button)` — return `"Button <n>: <command>"` or `"Button <n>: unassigned"` when missing.
- Run `../gradlew :14-collections-and-maps:test`.

## Tip
- When two commands tie for most common, returning either is fine; tests pick a clear winner.
