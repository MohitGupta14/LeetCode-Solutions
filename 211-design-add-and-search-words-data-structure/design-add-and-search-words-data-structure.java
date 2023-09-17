class WordDictionary {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;

        public TrieNode() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    private TrieNode root = new TrieNode();
    
    public void addWord(String word) {
        
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        return searchWord(root,word,0);
    }

    public static boolean searchWord(TrieNode node, String word, int index){
        if (index == word.length()) {
            return node.isEndOfWord;
        }

        char c = word.charAt(index);
   if (c == '.') {
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null && searchWord(node.children[i], word, index + 1)) {
                    return true;
                }
            }
            return false;
        } else {
            int childIndex = c - 'a';
            if (node.children[childIndex] != null) {
                return searchWord(node.children[childIndex], word, index + 1);
            } else {
                return false;
            }
        }
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */