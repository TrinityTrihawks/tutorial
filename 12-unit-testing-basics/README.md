## Goal
Write your own JUnit tests for a small class.

## Background
- Unit tests are small programs that check other code automatically.
- JUnit uses `@Test` methods with assertions like `assertEquals` to verify expected results.
- A good test names the behavior, sets up inputs, calls the method, and asserts the output.

## Steps
- Study `BatteryMonitor` in `src/main/java/org/first/tutorial/Exercise.java`.
- Open `src/test/java/org/first/tutorial/ExerciseTest.java` and replace the `fail(\"Write your own tests\")` calls with real tests.
- Add at least three tests that cover:
  - A healthy voltage
  - A critical low voltage
  - Percentage calculation at a known value
- Run `../gradlew :12-unit-testing-basics:test` until your tests pass.

## Tip
- Assert both boolean results and numeric percentages with a delta for doubles.
