class Solution {
    public String makeFancyString(String s) {
        
        if(s.length()<3){
            return s;
        }
        
        StringBuilder result = new StringBuilder();
        int repeatCount = 0;

        result.append(s.charAt(0));
        result.append(s.charAt(1));
        for(int i = 2 ; i < s.length(); i++){

            if(s.charAt(i-2) == s.charAt(i-1) && s.charAt(i) == s.charAt(i-1)){
                repeatCount++;
                continue;
            }else{
                repeatCount = 0;
            }

            if(repeatCount<3){
                result.append(s.charAt(i));
            }


        }

        return result.toString();

    }
}