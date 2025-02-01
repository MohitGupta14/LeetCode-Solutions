class Solution {
    public String reverseWords(String s) {
        ArrayList<String> temp = new ArrayList<>();
        s = s.trim(); 

        int i = 0;
        while (i < s.length()) {
            String word = "";

            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            while (i < s.length() && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }

            if (!word.isEmpty()) {
                temp.add(word);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int j = temp.size() - 1; j >= 0; j--) {
            ans.append(temp.get(j));
            if (j > 0) ans.append(" ");
        }

        return ans.toString();
    }
}
