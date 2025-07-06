# Complexity Analysis Exercises

Here are some code snippets to practice analyzing time complexity.

---

### Exercise 1

What is the time complexity of the following code?

```java
for (int i = 1; i < n; i *= 2) {
    for (int j = 0; j < n; j++) {
        // O(1) operation
    }
}
```

---

### Exercise 2

What is the time complexity of the following code?

```java
for (int i = 0; i < n; ++i) {
    for (int j = 0; j < i; ++j) {
        // O(1) operation
    }
}
```

---

### Exercise 3

What is the time complexity of the following code?

```java
for (int i = n; i > 0; i /= 2) {
    for (int j = 0; j < i; ++j) {
        // O(1) operation
    }
}
```

---

### Exercise 4

What is the time complexity of the following code?

```java
for (int i = 1; i * i <= n; ++i) {
    for (int j = 0; j < i; ++j) {
        // O(1) operation
    }
}
```
