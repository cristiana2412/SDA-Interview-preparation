public class Solution {
    public static boolean isPalindrome(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            if (s[i] != s[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        char[] s = {'h','a','n','n', 'a', 'h'};
        char[] s1 = {'h','e','l','o'};

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
    }
}
