package _02_data_structures.arrays.binary_search.find_element;

public class Solution {
    // O(log n)
    public static int binarySearch(int[] numbers, int value) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // equivalent to (left + right)/2, but avoids overflow
            if (numbers[mid] == value) {
                return mid;
            } else if (numbers[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1,0,3,5,9,12}, 9));
        // expect output: 4 because 9 exists in nums and its index is 4.
        System.out.println(binarySearch(new int[]{-1,0,3,5,9,12}, 2));
        // expect output:  -1 because 2 does not exist in nums so return -1.
    }
}
