## Goal
Get your tools working and print a friendly hello from the robot brain.

## Background
- A Java program lives in classes; a `main` method can run code, and methods like `greet` return values.
- Strings are text. You can combine them with `+` to build messages.
- Methods can take input (parameters) and return output; you’ll implement `greet(String name)`.

## Steps
- Confirm Java 17+ works: `java -version` and `javac -version`.
- Run the module tests: `../gradlew :1-setup-hello-world:test` (or `./gradlew` from the root once you generate the wrapper).
- Open `src/main/java/org/first/tutorial/Exercise.java` and implement `greet(String name)` so the tests pass.
- Rerun the tests to check your work.

## Tips
- Keep the message short and friendly for a teammate.
- Trim extra spaces from the provided name so “ Driver ” still works.
- Java’s `trim()` removes leading and trailing whitespace from a string; use it to clean up the name before building the greeting.
