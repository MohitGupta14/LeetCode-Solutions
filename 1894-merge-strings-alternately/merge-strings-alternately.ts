function mergeAlternately(word1: string, word2: string): string {
    
    let word = "";
    const maxLength = Math.max(word1.length, word2.length);
    for (let i = 0; i < maxLength; i++) {
        if (i < word1.length) word += word1.charAt(i);
        if (i < word2.length) word += word2.charAt(i);
    }

    return word;
};