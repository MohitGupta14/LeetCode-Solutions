class Solution {
    public String reverseWords(String s) {
        Queue<String>  q = new LinkedList<>();

        for(int i = 0 ; i < s.length() ; i++){
            String temp = "";
            while(i <s.length() && s.charAt(i) != ' '){
                temp = s.charAt(i)+temp;
                i++;
            }
            q.add(temp);
        }

        String ans = "";
        while(!q.isEmpty()){
            ans = ans+q.poll();
            if(q.isEmpty()){
                break;
            }
            ans = ans+" ";
        }

        return ans;
    }
}