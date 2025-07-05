package _02_data_structures.arrays.binary_search.two_sum;
import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[][] numbersWithIOldIndexes = new int[numbers.length][2];

        for (int i = 0; i <= numbers.length - 1; i++) {
            numbersWithIOldIndexes[i][0] = numbers[i];
            numbersWithIOldIndexes[i][1] = i;
        }

        Arrays.sort(numbersWithIOldIndexes, (a,b) -> Integer.compare(a[0], b[0]));
        Arrays.asList(numbersWithIOldIndexes).stream().forEach(arr -> System.out.println(Arrays.toString(arr)));
        
        // search for complement
        for (int i = 0; i <= numbers.length - 1; i++) {
            int complement = target - numbers[i];

            int index = binarySearch(numbersWithIOldIndexes, i, numbers.length - 1, complement);
            if (index != -1) {
                return new int[] {i, index};
            }
            
        }

        return new int[] {-1, -1};
    }

    public static int binarySearch(int[][] numbers, int left, int right, int value) {
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (numbers[mid][0] == value) {
                return numbers[mid][1];         // return the old index
            } else if (numbers[mid][0] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers0 = {3, 8, 5, 12, 1};
        System.out.println(Arrays.toString(twoSum(numbers0, 4)));

        int[] numbers1 = {2, 3, 8, 5, 12, 1};
        System.out.println(Arrays.toString(twoSum(numbers1, 4)));

        int[] numbers2 = {2, 3, 8, 5, 12, 2};
        System.out.println(Arrays.toString(twoSum(numbers2, 4)));
    }
}
