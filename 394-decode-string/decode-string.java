import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if(currentChar == ']') {
               
                StringBuilder subString = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '[') {
                    subString.insert(0, st.pop());
                }
            
                st.pop();

            
                StringBuilder numStr = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())) {
                    numStr.insert(0, st.pop());
                }
                int k = Integer.parseInt(numStr.toString());

                for(int j = 0; j < k; j++) {
                    for(char subChar : subString.toString().toCharArray()) {
                        st.push(subChar);
                    }
                }
            } else {
                st.push(currentChar);
            }
        }

        
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) {
            ans.insert(0, st.pop());
        }

        return ans.toString();
    }
}
