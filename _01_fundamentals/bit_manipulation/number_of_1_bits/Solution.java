package bit_manipulation.number_of_1_bits;

public class Solution {
    public static int countBits(int n) {
        int count = 0;

        while(n != 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // System.out.println(countBits(12));
        int a = -8;
        System.out.println(Integer.toBinaryString(a));
        a = a >> 1;
        System.out.println(Integer.toBinaryString(a));
        a = a >>> 1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(countBits(-1));
        System.out.println(countBits(8));
        System.out.println(countBits(128));
        System.out.println(countBits(11));
    }
}
