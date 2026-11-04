import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> list = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {

char ch = ransomNote.charAt(i);
       if (list.containsKey(ch)) {
    list.put(ch, list.get(ch) + 1);
        }else {
                list.put(ch, 1);
            }
        }
        for (int i = 0; i < magazine.length(); i++) {
    char ch = magazine.charAt(i);
        if (list.containsKey(ch)) {
                list.put(ch, list.get(ch) - 1);
            }
        }
        ArrayList<Character> keys = new ArrayList<>(list.keySet());

        for (int i = 0; i < keys.size(); i++) {

            char ch = keys.get(i);
            int freq = list.get(ch);

            if (freq > 0) {
                return false;
            }
        }

        return true;
    }
}