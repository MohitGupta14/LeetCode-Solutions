import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int i = 0;

        while (i < g.length && ans < s.length) {
            if (s[ans] >= g[i]) {
                i++;
            }
            ans++;
        }

        return i;
    }
}
