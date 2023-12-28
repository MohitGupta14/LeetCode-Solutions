class Solution {
    public int compress(char[] chars) {

       String s = "";
       for(int i = 0 ; i< chars.length;i++){
           s = s + chars[i];
       }
       String x = compress(s);
       for(int i = 0 ; i < x.length() ;i++){
           chars[i] = x.charAt(i);
       }

       return x.length();
        
    }
    public String compress(String s) {

        if (s == null || s.length() == 0) {
            return s;
        }

        StringBuilder ans = new StringBuilder();
        int temp = 1; 

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                temp++;
            } else {
                if(temp >1){
                ans.append(s.charAt(i - 1)).append(temp);
                }else{
                   ans.append(s.charAt(i - 1)) ;
                }
                temp = 1; 
            }
        }

        if(temp >1){
            ans.append(s.charAt(s.length()-1)).append(temp);
        }else{
             ans.append(s.charAt(s.length()-1)) ;
        }

        return ans.toString();
    }
}