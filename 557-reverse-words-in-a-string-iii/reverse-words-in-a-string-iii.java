class Solution {
    public String reverseWords(String s) {
        Stack<String>  q = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
             StringBuilder temp = new StringBuilder();
            while(i <s.length() && s.charAt(i) != ' '){
                temp.insert(0,s.charAt(i));
                i++;
            }
            q.add(temp.toString());
            if(i == s.length()){
                break;
            }
            q.add(" ");
        }

        StringBuilder ans = new StringBuilder();
        while(!q.isEmpty()){
            ans.insert(0,q.pop());
            
        }

        return ans.toString();
    }
}