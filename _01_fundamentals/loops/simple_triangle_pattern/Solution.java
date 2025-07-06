package loops.simple_triangle_pattern;

public class Solution {
    public static void printTrianglePattern(int noOfRows) {
        int currentNumber = 0;

        for(int i = 1; i <= noOfRows; i++) {
            for(int j = 1; j <= i; j++) {
                currentNumber++;
                System.out.print(currentNumber + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTrianglePattern(6);
    }
}
