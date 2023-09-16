class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
       int count = 0;

        for(int i = 0 ; i< cardPoints.length;i++){
           count = count + cardPoints[i];
        }

        if(k == cardPoints.length){
            return count ;
        }

        int j = 0;
        int n =  cardPoints.length;
        int subCount = 0;
        int minWindowSum = count;
        while(j !=  k+1){
            
            for(int i = j ; i < j+n-k;i++){
                subCount += cardPoints[i]; 
            }

            minWindowSum = Math.min(minWindowSum, subCount);
            subCount = 0;
            j++;
        }
        return count- minWindowSum;
    }
}