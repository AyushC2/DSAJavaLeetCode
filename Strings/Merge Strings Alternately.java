class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str1 = new StringBuilder();
    int i = 0;
    while(i < word1.length() || i < word2.length()){
        if(i < word1.length()){
            str1.append(word1.charAt(i));
        }
        if(i < word2.length()){
            str1.append(word2.charAt(i));
        }
        i++;
    }
    return str1.toString();
    }
}
