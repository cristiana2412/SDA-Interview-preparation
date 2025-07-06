# Ransom Note

Given two strings, `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed by using the letters from `magazine` and `false` otherwise.

Each letter in `magazine` can only be used once in your `ransomNote`.

---

### Example 1:

**Input:** `ransomNote = "a"`, `magazine = "b"`
**Output:** `false`
**Explanation:** The required character 'a' is not available in the magazine.

### Example 2:

**Input:** `ransomNote = "aa"`, `magazine = "ab"`
**Output:** `false`
**Explanation:** The note requires two 'a's, but the magazine only contains one.

### Example 3:

**Input:** `ransomNote = "givemoney"`, `magazine = "gyivomene"`
**Output:** `true`
**Explanation:** All characters for "givemoney" are present in the magazine.

---

### Constraints:

- `1 <= ransomNote.length, magazine.length <= 10^5`
- `ransomNote` and `magazine` consist of lowercase English letters.
