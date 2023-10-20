public class Solution {
    public boolean isPalindrome(String s) {
        int  i = 0;
        int j = s.length()-1;
        s = s.toLowerCase();
        
        while(i < j){
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        
        return true;

    }
}
