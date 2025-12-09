## Goal
Work with arrays and `ArrayList` to manage a list of robot waypoints.

## Background
- An array is a fixed-size container of items; a `List` (like `ArrayList`) can grow and shrink.
- Indexing starts at 0. Trying to access outside the bounds causes errors.
- Converting between arrays and lists is common when mixing library methods.

## Steps
- Implement in `src/main/java/org/first/tutorial/Exercise.java`:
  - `List<String> toWaypointList(String[] waypoints)` — return a mutable list copy of the array.
  - `int indexOfWaypoint(List<String> waypoints, String target)` — return index of target (case-sensitive) or `-1` if missing.
  - `String joinCommands(List<String> commands)` — join with `" -> "` between each command, or return `"EMPTY"` when there are none.
- Run `../gradlew :06-arrays-and-lists:test`.

## Tip
- Don’t mutate the incoming array; create a new list so students can experiment without breaking inputs.
