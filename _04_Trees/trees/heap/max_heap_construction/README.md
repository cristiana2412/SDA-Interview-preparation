# Min Heap Construction

Implement a `MinHeap` class that supports:

- Building a Min Heap from an input array of integers.
- Inserting a value into the heap.
- Removing the minimum value (the root) from the heap.
- Peeking at the minimum value without removing it.
- Sifting a value up to its correct position.
- Sifting a value down to its correct position.

The heap should be represented using an array.

---

## Class Methods:

- `MinHeap(array)`: Constructor to build the heap.
- `buildHeap(array)`: Builds the heap from an array. O(n) time complexity.
- `siftDown(currentIndex, endIndex, heap)`: Moves a node down. O(log n) time.
- `siftUp(currentIndex, heap)`: Moves a node up. O(log n) time.
- `peek()`: Returns the minimum value. O(1) time.
- `remove()`: Removes and returns the minimum value. O(log n) time.
- `insert(value)`: Inserts a new value. O(log n) time.

---

### Key Properties of a Min Heap:

1.  **Shape Property:** It's a complete binary tree, meaning all levels are filled except possibly the last, which is filled from left to right.
2.  **Heap Property:** The value of each node is less than or equal to the value of its children. This implies the minimum element is always at the root.
