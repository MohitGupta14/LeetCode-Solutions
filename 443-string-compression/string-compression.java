class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < chars.length; ) {
            char c = chars[i];
            int cnt = 1;
            while (i + 1 < chars.length && c == chars[i + 1]) {
                i++;
                cnt++;
            }
            str.append(c);
            if (cnt > 1) {
                str.append(cnt);
            }
            i++;
        }
        char[] comp = str.toString().toCharArray();
        for(int i=0;i<comp.length;i++){
            chars[i]=comp[i];
        }
        return comp.length;
    }
}