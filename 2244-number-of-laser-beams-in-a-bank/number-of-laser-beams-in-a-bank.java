import java.util.ArrayList;

class Solution {
    public int numberOfBeams(String[] bank) {
        
        int ans = 0;
        ArrayList<Integer> laser = new ArrayList<>();
        
        for (int i = 0; i < bank.length; i++) {
            int temp = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    temp++;
                }
            }
            if (temp != 0) {
                laser.add(temp);
            }
        }

        for (int i = 1; i < laser.size(); i++) {
            ans = ans + laser.get(i - 1) * laser.get(i);
        }

        return ans;
    }
}
