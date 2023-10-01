class Solution {
    public String reverseWords(String s) {
        Stack<String>  q = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            String temp = "";
            while(i <s.length() && s.charAt(i) != ' '){
                temp = s.charAt(i)+temp;
                i++;
            }
            q.add(temp);
            if(i == s.length()){
                break;
            }
            q.add(" ");
        }

        String ans = "";
        while(!q.isEmpty()){
            ans = q.pop() + ans ;
            
        }
        return ans;
    }
}