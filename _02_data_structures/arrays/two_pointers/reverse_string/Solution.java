package _02_data_structures.arrays.two_pointers.reverse_string;

import java.util.Arrays;

public class Solution {
public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while(i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] s1 = {'h','e','l','o'};

        reverseString(s);
        reverseString(s1);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s1));
    }
}
