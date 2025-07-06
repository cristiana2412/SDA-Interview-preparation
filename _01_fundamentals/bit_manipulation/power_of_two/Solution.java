package bit_manipulation.power_of_two;

public class Solution {
    public static boolean isPowerOfTwo(int n) {
        while(n > 1) {
            if (n % 2 != 0) return false;
            n = n/2;
        }
        return true;
    }

    public static boolean isPowerOfTwoBitManipulation(int n) {
        return (n>0) && ((n & (n-1))==0);
    }


    public static int bitCountMostEfficient(int n) {
        int counter = 0;
        while(n != 0) {
            n = n & (n-1);
            counter++;
        }
        return counter;
    }

    // 9 = 1001
    public static int bitCountByModulo2(int n) {
        int counter = 0;
        while(n > 0) {
            if (n % 2 != 0) counter++;
            n = n/2;
        }
        return counter;
    }

    public static void main(String[] args) {
        // System.out.println(isPowerOfTwo(16));
        // System.out.println(isPowerOfTwo(48));
        // System.out.println(isPowerOfTwoBit(16));
        // System.out.println(isPowerOfTwoBit(48));
        System.out.println(isPowerOfTwoBitManipulation(8192));
        System.out.println(bitCountByModulo2(45));
        System.out.println(Integer.toBinaryString(45));
        System.out.println(bitCountByModulo2(89));
        System.out.println(Integer.toBinaryString(89));
        System.out.println(bitCountByModulo2(9));
        System.out.println(Integer.toBinaryString(9));
        System.out.println(bitCountMostEfficient(-12));
        System.out.println(Integer.toBinaryString(-12));
    }
}
