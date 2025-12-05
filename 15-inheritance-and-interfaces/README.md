## Goal
Practice interfaces and inheritance with two drivebase implementations.

## Background
- An interface defines a contract (methods) without implementation; classes “implement” it to promise those methods exist.
- Inheritance lets a class reuse code from a parent class; here we mainly focus on interfaces for flexibility.
- Polymorphism means you can treat different drive types as the same interface and call `drive` without caring about the concrete class.

## Steps
- Define an interface `Drivebase` in `src/main/java/org/first/tutorial/Exercise.java` with:
  - Method `String drive(double forward, double turn)` that returns a formatted description.
- Implement two classes:
  - `TankDrive` implements `Drivebase`:
    - Calculate `left = forward + turn`, `right = forward - turn`, clamp each to [-1, 1].
    - Return `"Tank left:<left> right:<right>"`.
  - `MecanumDrive` implements `Drivebase`:
    - Calculate `frontLeft = forward + turn`, `frontRight = forward - turn`, `rearLeft = forward + turn`, `rearRight = forward - turn` (simplified for this exercise).
    - Clamp to [-1, 1] and return `"Mecanum FL:<fl> FR:<fr> RL:<rl> RR:<rr>"`.
- Run `../gradlew :15-inheritance-and-interfaces:test`.

## Tip
- Put the clamping logic in a helper to avoid duplication across classes.
