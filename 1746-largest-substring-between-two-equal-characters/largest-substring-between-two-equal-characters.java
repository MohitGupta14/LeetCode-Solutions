import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (lastIndexMap.containsKey(currentChar)) {
                maxLength = Math.max(maxLength, i - lastIndexMap.get(currentChar) - 1);
            } else {
                lastIndexMap.put(currentChar, i);
            }
        }

        return maxLength;
    }
}
