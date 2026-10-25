---
name: solution-tests
description: Create or update the JUnit SolutionTest for a given Solution class in this repo, covering the examples and edge cases. Use when asked to write, add, extend, or refresh tests for a problem package (e.g. "tests for plus_one_66", "update the tests for this Solution").
argument-hint: <package_name | path/to/Solution.java>
---

# Create / update tests for a Solution class

Target: `$ARGUMENTS` (a package name like `plus_one_66`, or a path to a `Solution.java`). If empty, use the Solution file open in the IDE / mentioned in the conversation; if still ambiguous, ask.

## 1. Read the solution

- Open `src/main/java/<package>/Solution.java`. Note every public/package-visible method, its signature, return type, and whether it is static or needs an instance (and any nested helper classes like `ListNode` / `TreeNode`, which may be inner classes needing `solution.new ListNode(...)`).
- Read the `main()` examples and any comments / Javadoc; they usually hold the LeetCode examples and constraints.
- Check what the method does on bad input (throws? returns a sentinel?). Test the behavior the code actually has; if it looks like a bug, tell the user instead of silently encoding it.

## 2. Read the existing test (update mode)

- Open `src/test/java/<package>/SolutionTest.java` if it exists. Keep every existing test unless it is wrong or no longer compiles; add only missing cases, never duplicate one. Reuse its naming and helpers.
- If the Solution's signature changed, fix the call sites.
- If it does not exist, create it (create mode).

## 3. Choose cases

Always include, where applicable:

1. **All examples** from the problem / `main()` (`testExampleOne`, `testExampleTwo`, ...).
2. **Minimal input**: empty array/string/list, null, single element, single character.
3. **Boundaries** from the constraints: min and max sizes/values, `Integer.MAX_VALUE` / `MIN_VALUE` (overflow), zero, negatives.
4. **Degenerate shapes**: all equal elements, already sorted / reverse sorted, no valid answer, whole input is the answer, answer at first/last position.
5. **Duplicates and overlaps**, repeated characters, case differences, non-adjacent matches.
6. **Structure-specific**: cycles / single node / unequal lengths for linked lists; skewed trees; disconnected or empty grids; window larger than input; k = 0 / k = length.
7. **Branch coverage**: one test per distinct branch or loop-exit path in the code.
8. **Invalid input** only when the code defines behavior (`assertThrows`).

Compute expected values by hand from the problem definition, not by running the solution. Keep each test to one scenario.

## 4. Write it

Match the repo style exactly (see CLAUDE.md):

- File `src/test/java/<package>/SolutionTest.java`, `package <package>;`, package-private `class SolutionTest`.
- Tabs for indentation, spaces inside parentheses: `assertEquals( List.of( 0, 6 ), Solution.foo( "abc", "b" ) );`
- `import org.junit.jupiter.api.Test;` plus static imports (`assertEquals`, `assertArrayEquals`, `assertThrows`, ...). No other dependencies.
- Package-private `@Test void testXxx()` methods named for the scenario: `testExampleOne`, `testEmptyList`, `testSingleElement`, `testNoMatch`.
- Use `assertArrayEquals` for arrays, never `assertEquals`. Use `assertEquals( expected, actual )` order. For linked lists / trees, add small private builder + comparison helpers rather than repeating loops.
- Non-LeetCode packages (e.g. `heap`) have classes named after the topic, not `Solution`; test that class.
- Don't modify `Solution.java` unless the user asks.

## 5. Verify

Run `mvn test -Dtest=<package>.SolutionTest` (fish shell: quote nothing special needed). All tests must pass.
- A failure means either a wrong expectation or a real bug. Re-derive the expected value by hand. If the solution is wrong, report it to the user with the failing input; do not bend the test to pass.

## 6. Report

Briefly list: tests added / changed / kept, the edge cases covered, and any suspected solution bug. Do not commit unless asked (repo convention when asked: `<Problem Name>: Add tests` or `... solution and tests`).
