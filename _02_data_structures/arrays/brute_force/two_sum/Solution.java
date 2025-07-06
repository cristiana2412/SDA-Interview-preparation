package _02_data_structures.arrays.brute_force.two_sum;

import java.util.Arrays;

public class Solution {
    // 0(n*n)
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; i <= n-1; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int[] numbers = {3, 8, 5, 12, 1, 2};
        System.out.println(Arrays.toString(twoSum(numbers, 4)));
    
    }
}
