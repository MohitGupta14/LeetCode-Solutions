import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        s = s.trim();  // Remove leading and trailing spaces

        Stack<String> st = new Stack<>();
        int ptr = 0;
        StringBuilder word = new StringBuilder();

        while (ptr < s.length()) {
            char ch = s.charAt(ptr);

            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) { 
                st.push(word.toString());
                word.setLength(0); 
            }
            ptr++;
        }

        // Push the last word (if any)
        if (word.length() > 0) {
            st.push(word.toString());
        }

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
            if (!st.isEmpty()) {
                result.append(" "); 
            }
        }

        return result.toString();
    }
}
