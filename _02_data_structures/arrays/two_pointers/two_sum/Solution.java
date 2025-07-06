package _02_data_structures.arrays.two_pointers.two_sum;
import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[][] numbersWithOldIndexes = new int[numbers.length][2];
        for(int i = 0; i <= numbers.length - 1; i++) {
            numbersWithOldIndexes[i][0] = numbers[i];
            numbersWithOldIndexes[i][1] = i;
        }

        Arrays.sort(numbersWithOldIndexes, (a,b) -> Integer.compare(a[0], b[0]));

        int i = 0;
        int j = numbersWithOldIndexes.length - 1;

        while(i < j) {
            if((numbersWithOldIndexes[i][0] + numbersWithOldIndexes[j][0]) == target) {
                return new int[]  { Math.min(numbersWithOldIndexes[i][1], numbersWithOldIndexes[j][1]), 
                    Math.max(numbersWithOldIndexes[i][1], numbersWithOldIndexes[j][1])
                    };
            } else if ((numbersWithOldIndexes[i][0] + numbersWithOldIndexes[j][0]) < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 8, 5, 12, 1, 2};
        System.out.println(Arrays.toString(twoSum(numbers, 4)));
    }
}
