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
        System.out.println(canConstruct("taylorswift", "ftslyrwaiotzz"));    // true
        System.out.println(canConstruct("beyonce", "coneybe"));              // true
        System.out.println(canConstruct("beyonce", "conybe"));               // false
        System.out.println(canConstruct("drake", "karedxyz"));               // true
        System.out.println(canConstruct("rihanna", "hanari"));               // false
        System.out.println(canConstruct("rihanna", "rhianna"));              // true
        System.out.println(canConstruct("zendaya", "azdneayyq"));            // true
        System.out.println(canConstruct("zendaya", "azdnayy"));              // false
        System.out.println(canConstruct("arianagrande", "arigrannedaan"));   // true
        System.out.println(canConstruct("arianagrande", "angrani"));         // false
        System.out.println(canConstruct("elonmusk", "msnkleou"));            // true
        System.out.println(canConstruct("elonmusk", "elomusk"));             // false
        System.out.println(canConstruct("selenagomez", "megozelnase"));      // true
        System.out.println(canConstruct("selenagomez", "gomez"));            // false
        System.out.println(canConstruct("dualipa", "ipadualp"));             // true
        System.out.println(canConstruct("dualipa", "dupla"));                // false
        System.out.println(canConstruct("justinbieber", "ubstjerneibti"));   // true
        System.out.println(canConstruct("justinbieber", "justin"));          // false
        System.out.println(canConstruct("billieeilish", "ieiblslilhlei"));   // true
        System.out.println(canConstruct("billieeilish", "billish"));         // false
    }

}
