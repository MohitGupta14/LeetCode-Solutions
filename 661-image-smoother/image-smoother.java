class Solution {
    public int[][] imageSmoother(int[][] img) {
        
        int l = img.length;
        int ans[][] = new int[l][img[0].length];
        for(int i = 0 ; i < l ;i++){
            for(int j = 0 ; j< img[0].length ; j++){
                int divisor = 0;
                int sum = 0 ;

                if(i-1 >= 0){
                    sum += img[i-1][j];
                    divisor++;
                    if(j-1 >=0){
                        sum += img[i-1][j-1]  ;
                        divisor++;
                    }
                    if(j+1 < img[0].length){
                        sum += img[i-1][j+1] ;
                        divisor++;
                    }
                }

                if(i+1 < l){
                    sum += img[i+1][j];
                    divisor++;
                    if(j-1>=0){
                        sum += img[i+1][j-1];
                        divisor++;
                    }
                    if(j+1<img[0].length){
                        sum += img[i+1][j+1];
                        divisor++;
                    }
                }

                if(j-1 >= 0){
                    sum +=  img[i][j-1];
                    divisor++;
                }

                if(j+1 < img[0].length){
                    sum+= img[i][j+1];
                    divisor++;
                }

                sum += img[i][j];  
                divisor++;

                ans[i][j] = (int)Math.floor((double)sum / divisor);
            }
        }

        return ans;
    }
}
