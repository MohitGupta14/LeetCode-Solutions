class Solution {
    public int islandPerimeter(int[][] arr) {
        int ans = 0;
        int mark = 4;
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 0 ; j<arr[i].length;j++){
                int temp = 4;
                if(arr[i][j] == 1){
                      if( i !=  0 && arr[i-1][j] == 1){
                          temp--;
                      }
                    if(j != 0 && arr[i][j-1] == 1){
                          temp--;
                      }
                    if(j != arr[i].length-1 && arr[i][j+1] == 1){
                          temp--;
                      }
                    if(i != arr.length-1 && arr[i+1][j] == 1){
                          temp--;
                      }
                    ans = ans + temp;
                }
                
            }
        }
        
        return ans;
    }
}