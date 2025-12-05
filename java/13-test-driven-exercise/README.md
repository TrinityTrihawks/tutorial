## Goal
Practice test-driven development (write tests first, then code).

## Background
- Test-driven development (TDD) means writing a failing test before the code.
- The cycle: write a small test, run and see it fail, write just enough code to pass, then refactor.
- This keeps scope small and gives fast feedback that you’re building the right thing.

## Scenario
You need to parse a simple command script for the robot. Commands are one per line, blank lines and lines starting with `#` are ignored.

## Steps
- Write tests in `src/test/java/org/first/tutorial/ExerciseTest.java` before touching the implementation.
- Desired behavior for `CommandParser.parse(String script)` (see `src/main/java/org/first/tutorial/Exercise.java`):
  - Split on newlines.
  - Ignore blank lines or lines that start with `#`.
  - Trim whitespace around each command.
  - Return the remaining commands in order as a `List<String>`.
- After writing tests, implement the code to make them pass.
- Run `../gradlew :13-test-driven-exercise:test` as you iterate.

## Tip
- Start with the simplest case (single command) and grow to comments/blank lines.
