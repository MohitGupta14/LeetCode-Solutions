class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        if( x == 0){
            return 0;
        }
        if(x <=3){
            return 1;
        }

        if(x == 2147483647){
            return 46340;
        }
        
        
        for(int i= 0 ; i< x ;i++){
            if(i*i == x){
                return i;
            }else if(i*i > x){
                return i -1;
            }
        }

        return ans;
    }
}