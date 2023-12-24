class Solution {
    public int minOperations(String s) {
        
        int ans1 = 0;
        int ans2 = 0;
        int n = s.length();
        char x = s.charAt(0);
        String temp1 = "";
        String temp2 = "";
        for(int i = 0 ; i<n ;i++){
            
            temp1 = temp1 + '0';
            temp1 = temp1 + '1';
        
            temp2 = temp2+ '1';
            temp2 = temp2 + '0';

            if(s.charAt(i) != temp1.charAt(i)){
                ans1++;
            }
            if(s.charAt(i) != temp2.charAt(i)){
                ans2++;
            }
        
        }


        return Math.min(ans1,ans2);
    }
}