public class Solution {
    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int i=1; i < numbers.length; i++){
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 32, 6, 1};
        System.out.println(findMax(numbers));
    }

}
