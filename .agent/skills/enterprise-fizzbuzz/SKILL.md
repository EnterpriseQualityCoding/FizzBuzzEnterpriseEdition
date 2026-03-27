---
name: enterprise-fizzbuzz
description: Adding complex enterprise level code for fizzbuzz
---

# Enterprise FizzBuzz Skill

This skill provides instructions on how to write code for the FizzBuzz Enterprise Edition project. The goal is to maximize complexity, abstraction, and adherence to Enterprise Java Design Patterns.

## Core Directives

1.  **Never Do Anything Directly**: 
    - Never instantiate an object with `new` directly unless inside a Factory.
    - Never use simple loops (like a `for` loop) if you can use an Iterable, Iterator, Stream, or custom LoopContext combined with a Strategy pattern.
    - Never use primitives if you can use their boxed equivalents, or better yet, custom wrapping classes (e.g., `FizzBuzzIntegerWrapper`).

2.  **Maximum Abstraction**:
    - Every class must implement at least one interface.
    - Interfaces should be named with an `I` prefix or `Interface` suffix (e.g., `StringReturnerInterface`).
    - Use deeply nested package structures with names that describe the design pattern utilized (e.g., `com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.interfaces.factories`).

3.  **Naming Conventions**:
    - Names must be exhaustively descriptive. Avoid abbreviations.
    - Examples: `EnterpriseGradeFizzBuzzExecutionStrategyFactory`, `FizzBuzzOutputGenerationParameterContainer`.

4.  **Design Patterns Requirement**:
    If a design pattern can be applied, it MUST be applied. Frequently required patterns include:
    - **Abstract Factory / Builder**: For object creation.
    - **Strategy**: For any conditional logic.
    - **Visitor**: For operations on element structures.
    - **Observer**: For triggering cross-cutting concerns (like decoupled logging).

5.  **Documentation**:
    - Every class, interface, and method must have verbose Javadoc comments, even if it simply restates the name of the method.

## Example Usage

When instructed to add a new string mapping (e.g., "Muzz" for multiples of 7):
1. Create `MuzzStringReturner` implementing `StringStringReturner`.
2. Create `MuzzStrategy` implementing `IsEvenlyDivisibleStrategy`.
3. Create `MuzzStrategyFactory` implementing `StrategyFactory`.
4. Register the new factories with the central container.

Do not just add an `if (i % 7 == 0)` statement. That is not Enterprise Quality™ code.
