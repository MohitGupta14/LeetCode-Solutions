class Solution {
    public List<List<String>> groupAnagrams(String[] nums) {
        List<List<String>> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != null) { 
                List<String> l = new ArrayList<>();
                l.add(nums[i]);
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != null  && isAnagram(nums[i], nums[j])) {
                        l.add(nums[j]);
                        nums[j] = null; 
                    }
                }
                ans.add(l);
            }
        }
        
        return ans;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
