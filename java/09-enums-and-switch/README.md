## Goal
Use `enum` and `switch` to model robot modes.

## Background
- An `enum` is a fixed set of named values (like a dropdown of allowed modes).
- `switch` lets you pick behavior based on a value; switching on enums is safer than strings because the compiler checks you covered all options.

## Steps
- Add an enum `RobotMode` in `src/main/java/org/first/tutorial/Exercise.java` with values `AUTO`, `TELEOP`, `TEST`, `DISABLED`.
- Implement in the same file:
  - `String describeMode(RobotMode mode)` — return a short message for each mode (see tests).
  - `RobotMode fromString(String input)` — case-insensitive parse; unknown values should return `DISABLED`.
- Use a `switch` expression to keep the logic tidy.
- Run `../gradlew :09-enums-and-switch:test`.

## Tip
- Prefer exhaustive switches on enums so the compiler reminds you when adding modes later.
