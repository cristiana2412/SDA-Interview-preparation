package _02_data_structures.arrays.sliding_window;

public class Solution {
    public static int maxSumOfKElements(int[] numbers, int k) {
        if (numbers == null || numbers.length < k || k < 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++){
            windowSum += numbers[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < numbers.length; i++){
            windowSum = windowSum - numbers[i-k] + numbers[i];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6, 7, 2, 1, 2, 5, 8};

        System.out.println(maxSumOfKElements(numbers, 3));
        System.out.println(maxSumOfKElements(numbers, 4));
    }

}
