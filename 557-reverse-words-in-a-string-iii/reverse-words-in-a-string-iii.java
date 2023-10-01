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

        StringBuilder ans = new StringBuilder();
        while(!q.isEmpty()){
            ans.insert(0,q.pop());
            
        }

        return ans.toString();
    }
}