class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0 ; i< s.length();i++){
            if(s.charAt(i) == '#' && !st.empty()){
                st.pop();
                continue;
            }else if(s.charAt(i) == '#' && st.empty()){
                continue;
            }

            st.add(s.charAt(i));
        }

        for(int i = 0 ; i< t.length();i++){
            if(t.charAt(i) == '#' && !st2.empty()){
                st2.pop();
                continue;
            }else if(t.charAt(i) == '#' && st2.empty()){
                continue;
            }

            st2.add(t.charAt(i));
        }

       while(!st.empty() && !st2.empty()){
           if(st.peek()!= st2.peek()){
               return false;
           }
           st.pop();
           st2.pop();
       }
       if(!st.empty() || !st2.empty()){
           return false;
       }

       return true;
    }
}