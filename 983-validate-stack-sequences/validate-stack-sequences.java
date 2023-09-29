class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer>st = new Stack<>();
        int j =0;
        for(int i =0 ; i < pushed.length;i++){
            
            st.push(pushed[i]);
            
            while(!st.empty() && st.peek() == popped[j]){
                j++;
                st.pop();
            }
          
        }
       
        for(int i = j; i < popped.length ;i++){
            if(popped[i] == st.peek()){
                st.pop();
            }
        }

        return st.empty();
    }
}