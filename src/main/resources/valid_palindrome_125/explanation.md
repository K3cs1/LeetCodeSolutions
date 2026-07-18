## Sketch Explanation: Valid Palindrome – Optimal Two-Pointer Solution

This flowchart walks through the optimal, constant-memory solution to **LeetCode 125 – Valid Palindrome**.

- We start with two pointers: `left` at index `0` and `right` at the last index of the string.
- As long as `left < right`, we keep looping.
- Inside the loop, we first **skip past any non-alphanumeric characters** — moving `left` forward and `right` backward
  until both land on a letter or digit.
- Then we **lowercase and compare** those two characters:
    - If they **don't match**, we immediately return `False`, since the string can't be a palindrome.
    - If they **do match**, we move both pointers one step inward and repeat.
- Once `left` and `right` cross or meet, the loop ends and we return `True` — no mismatches were found, so the string is
  a palindrome.

**Key advantage:** unlike the naive approach, we never build a new filtered or reversed string — we compare characters
in place, giving us **O (n) time** with **O (1) extra space**.