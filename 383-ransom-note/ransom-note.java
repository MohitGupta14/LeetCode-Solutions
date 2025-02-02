class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character s : magazine.toCharArray()){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(Character s : ransomNote.toCharArray()){
            if(map.containsKey(s) && map.get(s) != 0){
                map.put(s,map.get(s)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}