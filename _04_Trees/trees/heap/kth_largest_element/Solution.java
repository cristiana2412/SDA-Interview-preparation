package _04_Trees.trees.heap.kth_largest_element;
import _04_Trees.trees.heap.max_heap_construction.MaxHeap;

public class Solution {

    // Time complexity: O(n log n)
    // Space complexity: O(n)
    public static int findKthLargest(int[] nums, int k) {
        MaxHeap heap = new MaxHeap(nums.length); // O(1) allocation

        // Insert all elements into the MaxHeap
        for (int num : nums) {
            heap.insert(num); // each insert: O(log n), total O(n log n)
        }

        // Extract max k-1 times
        for (int i = 1; i < k; i++) {
            heap.extractMax(); // each extractMax: O(log n), total O(k log n)
        }

        return heap.getMax(); // O(1)
    }

    public static void main(String[] args) {
        int[] nums = {12, 3, 5, 7, 19, 0, 25, 17};
        int k = 3;

        int result = findKthLargest(nums, k);
        System.out.println("Array:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println(k + "-th largest element: " + result);
    }
}
