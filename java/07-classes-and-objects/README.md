## Goal
Model a small `Robot` class with state and behavior.

## Background
- A class defines a blueprint; objects are specific instances built from that blueprint.
- Fields hold state (data), constructors set up new objects, methods define behaviors.
- Keeping data updates in methods helps you control how state changes over time.

## Steps
- In `src/main/java/org/first/tutorial/Exercise.java`, create a `Robot` class (it can be top-level or static inner).
- Requirements:
  - Fields: `name` (String), `batteryVoltage` (double), `tasksCompleted` (int, start at 0).
  - Constructor accepting `name` and `batteryVoltage`.
  - Method `void completeTask()` increments `tasksCompleted` and drains battery by `0.1` volts.
  - Method `String summary()` returns `"Robot <name>: <tasksCompleted> tasks, <batteryVoltage>V"`.
  - Guard battery from dropping below 0.
- Run `../gradlew :07-classes-and-objects:test` and adjust.

## Tip
- Keep fields private and expose getters if you want to practice encapsulation early.
