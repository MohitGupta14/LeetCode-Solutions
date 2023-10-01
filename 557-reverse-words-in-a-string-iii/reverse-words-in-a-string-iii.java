class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" "); // Split the sentence into words using space as a delimiter

        for (int i = 0; i < words.length; i++) {
            // Reverse each word and append it to the result
            result.append(reverseWord(words[i]));

            // Add a space if it's not the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    // Helper function to reverse a word
    private String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at the left and right positions
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}
