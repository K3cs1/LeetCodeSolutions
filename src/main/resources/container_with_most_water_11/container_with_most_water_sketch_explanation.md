# Container With Most Water — Two-Pointer Flowchart

This sketch visualizes the **O(n) two-pointer solution** to [LeetCode 11: Container With Most Water](https://leetcode.com/problems/container-with-most-water/).

## How it works

1. **Initialize** two pointers at opposite ends of the array — `left = 0` and `right = n - 1` — to start with the maximum possible width.
2. **Loop** while `left < right`.
3. **Compute the area** at each step as `width × min(height[left], height[right])`, since the shorter wall is always the bottleneck (water can't rise above it).
4. **Track the max** area seen so far.
5. **Move the pointer at the shorter wall** inward — there's no benefit to shrinking the width while keeping the smaller (limiting) height in place, so only moving the shorter side has a chance to improve the area.
6. **Repeat** until the pointers meet, then return the max area found.

## Why it's O(n)

Each pointer moves inward exactly once over the course of the algorithm, so the array is traversed a single time — no nested loops, no recomputation. Compare this to the brute-force O(n²) approach, which checks every possible pair.

---

*Diagram made with draw.io — feel free to import the `.drawio` file and tweak it for your own notes.*
