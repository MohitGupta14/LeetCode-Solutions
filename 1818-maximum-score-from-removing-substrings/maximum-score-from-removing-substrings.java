class Solution {
    public int maximumGain(String s, int x, int y) {

        Stack<Character> stack = new Stack<>();
        int ans = 0;

        if (x > y) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!stack.isEmpty() && stack.peek() == 'a' && c == 'b') {
                    stack.pop();
                    ans += x;
                } else {
                    stack.push(c);
                }
            }

            Stack<Character> temp = new Stack<>();
            while (!stack.isEmpty()) {
                char c = stack.pop();
                if (!temp.isEmpty() && c == 'b' && temp.peek() == 'a') {
                    temp.pop();
                    ans += y;
                } else {
                    temp.push(c);
                }
            }

        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!stack.isEmpty() && stack.peek() == 'b' && c == 'a') {
                    stack.pop();
                    ans += y;
                } else {
                    stack.push(c);
                }
            }

            Stack<Character> temp = new Stack<>();
            while (!stack.isEmpty()) {
                char c = stack.pop();
                if (!temp.isEmpty() && c == 'a' && temp.peek() == 'b') {
                    temp.pop();
                    ans += x;
                } else {
                    temp.push(c);
                }
            }
        }

        return ans;
    }
}