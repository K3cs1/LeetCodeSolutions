# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Overview

LeetCode problem solutions in Java with JUnit tests. Maven project, Java 25 (`maven.compiler.source/target=25`), JUnit Jupiter 6.x. No other dependencies.

## Commands

- Run all tests: `mvn test`
- Run one problem's tests: `mvn test -Dtest=<package_name>.SolutionTest` (e.g. `-Dtest=flexible_size_sliding_window_longest.SolutionTest`)
- Run one test method: `mvn test -Dtest=<package_name>.SolutionTest#testExampleOne`

## Layout and conventions

Each problem lives in its own snake_case package, mirrored in main and test trees:

- `src/main/java/<problem_name>[_<leetcode_number>]/Solution.java`
- `src/test/java/<problem_name>[_<leetcode_number>]/SolutionTest.java`

Packages for LeetCode-numbered problems end in the number (e.g. `contains_duplicate_II_219`); non-LeetCode/utility exercises have no suffix (e.g. `heap`, `calculate_expression`, whose classes are named after the topic rather than `Solution`).

Style to match:
- Tabs for indentation, spaces inside parentheses (`foo( a, b )`, `if ( x )`).
- `Solution` is a public class with a public static method; it often has a `static void main()` (Java 25 instance-main style, no `String[] args`) printing the examples.
- Tests are package-private `class SolutionTest` with JUnit 5/6 `@Test` methods (`testExampleOne`, `testEmptyList`, ...) using static-imported `assertEquals`; they cover the examples plus edge cases.

Commits are typically one per problem, e.g. `Longest Subarray Sum: Add sliding window solution and tests`, adding both the Solution and SolutionTest.
