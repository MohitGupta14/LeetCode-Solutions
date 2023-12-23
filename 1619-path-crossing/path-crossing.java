class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String>s = new HashSet<>();
        String currentPos = "0,0";
        for(int i = 0 ; i < path.length() ;i++){
            s.add(currentPos);
            if(path.charAt(i) == 'N'){
                y = y+1;
        currentPos = String.valueOf(x) + ',' + String.valueOf(y);
            }
            else if(path.charAt(i) == 'S'){
                y = y-1;
        currentPos = String.valueOf(x) + ',' + String.valueOf(y);
            }
            else if(path.charAt(i) == 'E'){
                x = x+1;
        currentPos = String.valueOf(x) + ',' + String.valueOf(y);
            }
            else if(path.charAt(i) == 'W'){
                x = x-1;
        currentPos = String.valueOf(x) + ',' + String.valueOf(y);
            }

         if(s.contains(String.valueOf(x) + ',' + String.valueOf(y)) ){
                return true;
            }
        
        }


        return false;
    }
}