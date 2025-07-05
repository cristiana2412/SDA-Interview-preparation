package _02_data_structures.arrays.two_pointers.two_sum;
import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[][] numbersWithIOldIndexes = new int[numbers.length][2];

        for (int i = 0; i <= numbers.length - 1; i++) {
            numbersWithIOldIndexes[i][0] = numbers[i];
            numbersWithIOldIndexes[i][1] = i;
        }

        Arrays.sort(numbersWithIOldIndexes, (a,b) -> Integer.compare(a[0], b[0]));

        int i = 0;
        int j = numbersWithIOldIndexes.length - 1;

        while (i < j) {
            if (numbersWithIOldIndexes[i][0] + numbersWithIOldIndexes[j][0] == target) {
                return new int[] { Math.min(numbersWithIOldIndexes[i][1], numbersWithIOldIndexes[j][1]),
                                    Math.max(numbersWithIOldIndexes[i][1], numbersWithIOldIndexes[j][1])};
            } else if (numbersWithIOldIndexes[i][0] + numbersWithIOldIndexes[j][0] < target) {
                i++;
            } else {
                j--;
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
        int[] numbers0 = {3, 8, 5, 12, 1, 2};
        System.out.println(Arrays.toString(twoSum(numbers0, 4)));
    }
}
