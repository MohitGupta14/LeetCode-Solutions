class Solution {
    public String removeStars(String s) {

        Stack<Character> s1 = new Stack<>();

        for(int i = 0 ; i< s.length() ; i++){

            if(s.charAt(i) != '*'){
                s1.push(s.charAt(i));
            }else{
                s1.pop();
            }
        }

        String ans = "";
        while(!s1.empty()){
            ans = s1.pop() + ans;
        }   
         return ans;

    }
}