package _03_HashTables.hash_tables.ransom_note;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : magazine.toCharArray()) {
            // if(c a fost pus deja candva) {
            //     map.put(c, map.get(c)+1);
            // } else {
            //     map.put(c, 1);
            // }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c)-1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("taylorswift", "ftslyrwaiotzz"));
        System.out.println(canConstruct("beyonce", "conybe"));
        // canConstruct(null, null)
    }

}
